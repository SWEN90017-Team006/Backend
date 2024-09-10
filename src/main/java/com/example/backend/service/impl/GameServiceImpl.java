package com.example.backend.service.impl;

import com.example.backend.service.GameService;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
    @Override
    public String processRequest(String request) {
        return request + ", hello there";
    }
}
