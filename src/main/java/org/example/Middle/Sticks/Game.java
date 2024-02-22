package org.example.Middle.Sticks;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static Random random = new Random();

    public static void main(String[] args) {
        StickPrinter stickPrinter = new StickPrinter();
        Scanner scanner = new Scanner(System.in);

        int sticks = 20;

        System.out.println("Добро пожаловать в игру \"Палочки\"!");
        stickPrinter.printSticks(sticks);
        System.out.println("У нас " + sticks + " сколько вы хотите убрать?");

        while (sticks > 1) {
            int playerMove = getPlayerMove(sticks);
            sticks -= playerMove;
            if (sticks <= 1) {
                System.out.println("Поздравляю, вы победили! Осталась последняя палочка.");
                break;
            }
            int computerMove = getComputerMove(sticks);
            sticks -= computerMove;

            System.out.println("Компьютер делает ход и убирает " + computerMove + " палочек");
            stickPrinter.printSticks(sticks);
            if (sticks<=1){
                System.out.println("Увы, вы проиграли.");
            }
            System.out.println("Осталось палочек: " + sticks);

        }

    }


    private static int getPlayerMove(int sticks) {
        Scanner scanner = new Scanner(System.in);
        int playMove;
        do {
            System.out.println("Ваш ход ( выберите сколько палочек хотите убрать от 1 до 3)? ");
            playMove = scanner.nextInt();
        } while (playMove < 1 || playMove > 3 || playMove >= sticks);
        return playMove;
    }

    private static int getComputerMove(int sticks) {
        return Math.min(sticks, random.nextInt(3) + 1);

    }

}
