package org.example.Middle.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTakToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Добро пожаловать в игру Крестики-Нолики! ");
        System.out.println( "Введите ваше имя : ");
        String playerName = scanner.nextLine();
        String compName = generateRandomComputerName();
        System.out.println(" Привет " + playerName + " меня зовут " + compName);

        Player player1 = new Player(playerName, 'X');
        Player player2 = new Player(compName, 'Y');

        Game game = new Game(player1,player2);
        game.playGame();


    }
    private static String generateRandomComputerName (){
        String [] computerNames = {"ComputerBot", "AI_Player", "ElectronicBrain", "RoboGamer"};
        Random random = new Random();
        int randomIndex = random.nextInt(computerNames.length);
        return computerNames[randomIndex];
    }
}
