package com.emailassistant.controller;

import com.emailassistant.dto.ChatRequest;
import com.emailassistant.dto.ChatResponse;
import com.emailassistant.service.ChatService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService){
        this.chatService = chatService;
    }

    @PostMapping
    public ChatResponse chat(@Valid @RequestBody ChatRequest request){
        String reply = chatService.generateResponse(request.message());

        return new ChatResponse(reply);
    }
}

