package org.example.Hard;

public class Game {
    public static void main(String[] args) {
        try {
            BlackjackGame game = new BlackjackGame();
            game.playGame();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
