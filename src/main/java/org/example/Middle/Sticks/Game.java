package org.example.Middle.Sticks;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private static Random random = new Random();
    private static final int MAX_STICKS_TO_REMOVE = 3;
    private static int STICKS = 20;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("Добро пожаловать в игру \"Палочки\"!");

        StickPrinter.printSticks(STICKS);

        System.out.println("У нас " + STICKS + " сколько вы хотите убрать?");

        while (getSticks() > 1) {
            int playerMove = getPlayerMove(getSticks());
            STICKS -= playerMove;
            if (getSticks() <= 1) {
                System.out.println("Поздравляю, вы победили! Осталась последняя палочка.");
                break;
            }
            int computerMove = getComputerMove(getSticks());
            STICKS -= computerMove;

            System.out.println("Компьютер делает ход и убирает " + computerMove + " палочек");
            StickPrinter.printSticks(getSticks());
            if (STICKS <= 1) {
                System.out.println("Увы, вы проиграли.");
            }
            System.out.println("Осталось палочек: " + STICKS);

        }

    }

    private static int getSticks() {
        return STICKS;
    }

    private static int getPlayerMove(int sticks) {
        int playMove;
        do {
            System.out.println("Ваш ход ( выберите сколько палочек хотите убрать от 1 до 3)? ");
            playMove = scanner.nextInt();
        } while (playMove < 1 || playMove > MAX_STICKS_TO_REMOVE || playMove >= sticks);
        return playMove;
    }

    private static int getComputerMove(int sticks) {
        return Math.min(sticks, random.nextInt(3) + 1);

    }

}