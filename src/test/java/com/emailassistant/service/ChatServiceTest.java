package com.emailassistant.service;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChatServiceTest {

    private final ChatService chatService = new ChatService();

    @Test
    void shouldGenerateResponseForUserMessage(){

        //Arrange: Prepare a sample message.
        String message = "Hello";

        //Act: Execute the service method.
        String response = chatService.generateResponse(message);

        //Assert: Verify the expected result.
        assertEquals(
                "I received your message: Hello",
                response
        );
    }
}
