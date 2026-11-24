package Spring.AI.Chatbot.Config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Aiconfig {
    @Bean
	public ChatClient chat(ChatClient.Builder ai) {
		return ai.build();
	}
    
}