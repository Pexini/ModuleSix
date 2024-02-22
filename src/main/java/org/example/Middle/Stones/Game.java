package org.example.Middle.Stones;

import java.util.Scanner;

public class Game {
    private static final int MAX_NUMBER = 100;
    private static Scanner scanner = new Scanner(System.in);


    private Player player1;
    private Player player2;

    public Game() {

        this.player1 = new Player("Игрок 1");
        this.player2 = new Player("Игрок 2");
    }

    public void playGame() {

        int computerNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Привет друзья. Давайте сыграем в игру \"Камешки\". Суть такова: ");
        System.out.println("Я загодал число от 1 до 100, если сумма названных Вами чисел будет больше числа которое я загадал, вы проиграли. ");

        while (true) {
            playerMove(player1);
            if (checkResult(computerNumber, player1)) break;

            playerMove(player2);
            if (checkResult(computerNumber, player2)) break;
        }
        scanner.close();
    }

    private void playerMove(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        int playerInput = scanner.nextInt();
        player.addToCounter(playerInput);
    }

    private boolean checkResult(int computerNumber, Player player) {
        int totalSum = player.getCounter();
        if (totalSum == computerNumber) {
            System.out.println(player.getName() + " выиграл! Сумма ваших чисел " + totalSum);
            System.out.println("Я загадал число " + computerNumber);
            printResult();
            return true;
        } else if (totalSum > computerNumber) {
            System.out.println(player.getName() + " Проиграл, сумма слишком большая");
            System.out.println("Я загадал число " + computerNumber);
            System.out.println("Сумма чисел " + player1.getName() + " - " + player1.getCounter());
            System.out.println("Сумма чисел " + player2.getName() + " - " + player2.getCounter());

            return true;
        }
        return false;
    }

    private void printResult() {
        System.out.println("Результаты:");
        System.out.println(player1.getName() + ": " + player1.getCounter());
        System.out.println(player2.getName() + ": " + player2.getCounter());
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}
