package com.dmcme.boardgame.games;

import com.dmcme.boardgame.player.Player;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Chess {
    private boolean checkMate;
    private ArrayList <Object> player1 = new ArrayList<>();
    private ArrayList <Object> player2 = new ArrayList<>();

    public Chess(String player1Name, String player2Name) {
        this.player1.add(new Player(player1Name));
        setupPlayersBoard(player1, "Black");
        this.player2.add(new Player(player2Name));
        setupPlayersBoard(player2, "White");
    }

    private void setupPlayersBoard(ArrayList player, String playerColour) {

    }
}
