package org.example.Middle.TicTacToe;

public class Player {
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

}
