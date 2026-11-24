package Spring.AI.Chatbot.Service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class chatservice {

	    @Autowired
	    ChatClient chatClient;

	    public String getResponse(String question) {

	        return chatClient.prompt()
	                .user(question)
	                .call()
	                .content();
	    }
	}

