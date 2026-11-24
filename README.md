# AI Chatbot using Spring AI and Groq API

## Project Overview

This project is an AI-powered chatbot developed using Java, Spring Boot, Spring AI, and the Groq API. It allows users to ask questions through REST APIs and receive AI-generated responses using a Large Language Model (LLM).

The application demonstrates how to integrate Generative AI capabilities into a Spring Boot application.

## Technologies Used

- Java 25
- Spring Boot 4.2.0
- Spring AI 2.1.0
- Groq API
- REST API
- Maven

## Project Architecture

```text
AI-Chatbot
│
├── src/main/java
│   └── Spring/AI/Chatbot
│       ├── AiChatbotApplication.java
│       ├── Config
│       │   └── Aiconfig.java
│       ├── Service
│       │   └── chatservice.java
│       └── controller
│           └── Aicontroller.java
│
├── src/main/resources
│   └── application.properties
│
├── src/test
├── pom.xml
└── README.md
```

## Features

- Accepts user questions through REST APIs.
- Integrates Large Language Models using Spring AI.
- Generates AI-powered responses using the Groq API.
- Uses ChatClient to communicate with the AI model.
- Follows a controller-service architecture.

## Configuration

1. Clone this repository:

```bash
git clone https://github.com/YOUR_USERNAME/spring-ai-chatbot.git
```

2. Navigate to the project directory.

3. Configure your Groq API key as an environment variable named `GROQ_API_KEY`.

4. Make sure your `application.properties` contains:

```properties
spring.application.name=AI-Chatbot

spring.ai.openai.api-key=${GROQ_API_KEY}
spring.ai.openai.base-url=https://api.groq.com/openai/v1
spring.ai.openai.chat.model=openai/gpt-oss-20b
spring.ai.openai.chat.temperature=0.7

server.port=3333
```

5. Run the Spring Boot application:

```bash
mvn spring-boot:run
```

## API Testing

**Endpoint:** 

```http
GET http://localhost:3333/api/chat?question=What is Java?
```

**Expected Response:**

An AI-generated answer explaining Java.

You can test the API using Postman.

## Learning Outcomes

- Understanding Spring AI integration.
- Working with Large Language Models (LLMs).
- Building REST APIs using Spring Boot.
- Integrating external AI services.
- Understanding the ChatClient abstraction.

## Future Enhancements

- Conversation memory.
- MySQL integration for chat history.
- User authentication using Spring Security and JWT.
- PDF question-answering using Retrieval-Augmented Generation (RAG).
- React-based chatbot interface.

## Author

**Praneeth**

Java Developer | Spring Boot | Spring AI | Generative AI
