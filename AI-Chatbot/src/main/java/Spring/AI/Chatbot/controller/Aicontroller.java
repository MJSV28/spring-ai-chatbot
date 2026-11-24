package Spring.AI.Chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Spring.AI.Chatbot.Service.chatservice;
@RestController
@RequestMapping("/api/chat")
public class Aicontroller {

	@Autowired
	chatservice service;
    @GetMapping
    public String chat(@RequestParam String question) {

        return service.getResponse(question);
    }
}

