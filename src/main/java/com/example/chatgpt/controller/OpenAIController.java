package com.example.chatgpt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.chatgpt.model.MensagemDTO;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.input.Prompt;
import dev.langchain4j.model.input.PromptTemplate;
import dev.langchain4j.model.openai.OpenAiChatModel;

@RestController
public class OpenAIController {

    @Autowired
    ChatLanguageModel model;

    @Autowired
    Environment env;

    @PostMapping("/chat")
    public String conversarComGPT(@RequestBody MensagemDTO mensagemDTO) {
        return model.generate(mensagemDTO.mensagem());
    }

    @PostMapping("/chat4")
    public String conversarComGPT4(@RequestBody MensagemDTO mensagemDTO) {
        // A chave da API deve ser buscada do arquivo application.properties ou diretamente pela env
        String apiKey = env.getProperty("langchain4j.open-ai.chat-model.api-key");

        ChatLanguageModel model = OpenAiChatModel.builder()
                .apiKey(apiKey)
                .temperature(0.5)
                .modelName("gpt-4o")
                .build();

        return model.generate(mensagemDTO.mensagem());
    }

    @PostMapping("/template")
    public String conversarComGPT4Template(@RequestBody MensagemDTO mensagem) {
        PromptTemplate template = PromptTemplate.from("Você é um programador Java. Você deve responder essa pergunta: {{question}}");

        Map<String, Object> mapa = new HashMap<>();
        mapa.put("question", mensagem.mensagem());

        Prompt prompt = template.apply(mapa);

        return model.generate(prompt.text());
    }
}
