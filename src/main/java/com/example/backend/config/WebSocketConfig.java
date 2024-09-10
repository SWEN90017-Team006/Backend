package com.example.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import com.example.backend.handler.HRGWebSocketHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Autowired
    private HRGWebSocketHandler HRGWebSocketHandler;
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // register the websocket server
        registry.addHandler(HRGWebSocketHandler, "/Human-Rights-Game")
                .setAllowedOrigins("*");
    }
}
