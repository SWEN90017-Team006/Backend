package com.example.backend.model;

import lombok.Data;

@Data
public class Game {
    private int playersNumber;
    private int roomsNumber;
    private String gameID;
    private String gameMessage;
}
