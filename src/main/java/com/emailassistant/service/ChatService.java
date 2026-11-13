package com.emailassistant.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
    public String generateResponse(String message){
        return "I received your message: " +message;
    }
}
