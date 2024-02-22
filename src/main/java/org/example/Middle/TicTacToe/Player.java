package org.example.Middle.TicTacToe;

public class Player {


    private String name;
    private char symbol;

    private boolean startingPlayer;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }


    public boolean isStartingPlayer() {
        return startingPlayer;
    }

    public void setStartingPlayer(boolean startingPlayer) {
        this.startingPlayer = startingPlayer;
    }

}
