package com.emailassistant.dto;

import jakarta.validation.constraints.NotBlank;

//defines the data expected when someone sends a chat message.
public record ChatRequest(
        @NotBlank(message = "Message cannot be empty.")
        String message
) {
}
