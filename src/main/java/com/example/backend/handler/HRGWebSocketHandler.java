package com.example.backend.handler;

import com.example.backend.model.Game;
import com.example.backend.service.GameService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

@Component
public class HRGWebSocketHandler extends TextWebSocketHandler {
    @Autowired
    private GameService gameService;
    private ObjectMapper objectMapper = new ObjectMapper();
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws IOException {
        String request = message.getPayload();
        Game game = objectMapper.readValue(request, Game.class);
        session.sendMessage(new TextMessage(gameService.processRequest(game.getGameMessage())));
        session.close();
    }
}
