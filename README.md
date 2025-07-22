

# README.md atualizado

````markdown
# spring-boot-chatgpt

Projeto Spring Boot simples para integração com OpenAI usando LangChain4j (exemplo).

## 📋 Descrição

Aplicação backend em Java usando Spring Boot e LangChain4j, que consome a API da OpenAI para funcionalidades de chatbot ou outras integrações.  
Este projeto serve como base para aprendizado e desenvolvimento rápido com Java, Maven, LangChain4j e OpenAI.

---

## 🚀 Tecnologias usadas

- Java 17+ / 22 (OpenJDK)  
- Spring Boot  
- Maven (usando Maven Wrapper)  
- LangChain4j — biblioteca para construção de cadeias de chamadas de LLM  
- OpenAI API (integração via `application.properties` ou variáveis de ambiente)  
- Git  

---

## ⚙️ Pré-requisitos

- Java JDK 17 ou superior instalado e configurado (variável `JAVA_HOME` apontando para o JDK)  
- Maven (você pode usar o Maven Wrapper incluso no projeto)  
- Conta e chave da API OpenAI  
- Git para controle de versão  

---

## 🔧 Configuração

1. Clone este repositório:

```bash
git clone https://github.com/SEU_USUARIO/spring-boot-chatgpt.git
cd spring-boot-chatgpt
````

2. Configure a chave da API OpenAI:

> **Importante:** não deixe a chave salva diretamente no código! Use variáveis de ambiente ou `.env`.

Exemplo usando variável de ambiente no Linux/Mac/WSL:

```bash
export OPENAI_API_KEY="sua-chave-aqui"
```

Ou no Windows PowerShell:

```powershell
setx OPENAI_API_KEY "sua-chave-aqui"
```

3. Ajuste o `application.properties` para ler a variável:

```properties
openai.api.key=${OPENAI_API_KEY}
```

---

## 🏃 Como rodar

No terminal, dentro da pasta do projeto, execute:

```bash
./mvnw spring-boot:run
```

Isso vai compilar e iniciar a aplicação na porta padrão (geralmente 8080).

---

## 🧪 Testes

(Se você implementou testes, explique aqui como rodá-los)

---

## 📁 Estrutura do projeto

* `src/main/java` — código-fonte Java
* `src/main/resources` — configurações e recursos
* `pom.xml` — configuração do Maven
* `mvnw`, `mvnw.cmd` — Maven Wrapper para facilitar o build

---

## 💡 Dicas e boas práticas

* Nunca suba chaves e senhas para o repositório!
* Use `.gitignore` para ignorar arquivos sensíveis e pastas de build (`target/`)
* Use variáveis de ambiente para configuração sensível
* Documente seu código e mantenha o README atualizado

---

## 📞 Contato

Para dúvidas ou sugestões, abra uma issue no GitHub ou entre em contato.

---

## 📝 Licença

(Coloque aqui a licença do projeto, se desejar, ex: MIT)

---


