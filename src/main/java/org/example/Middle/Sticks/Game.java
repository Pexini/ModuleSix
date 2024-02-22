package org.example.Middle.Sticks;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static Random random = new Random();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sticks = 20;

        System.out.println("Добро пожаловать в игру \"Палочки\"!");
        System.out.println( "У нас 20 палочек, сколько вы хотите убрать?");
        while (sticks > 0) {
            int playerMove = getPlayerMove();
            sticks -= playerMove;
            if (sticks <= 1) {
                System.out.println("Поздравляю, вы победили! Осталась последняя палочка.");
                break;
            }
            int computerMove = getComputerMove(sticks);
            sticks -= computerMove;
            System.out.println("Компьютер делает ход и убирает " + computerMove + " палочек");
            System.out.println("Осталось палочек: " + sticks);

        }

    }

    private static int getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int playMove;
        do {
            System.out.println("Ваш ход ( выберите сколько палочек хотите убрать от 1 до 3)? ");
            playMove = scanner.nextInt();
        } while (playMove < 1 || playMove > 3);
        return playMove;
    }

    private static int getComputerMove(int sticks) {
        return Math.min(sticks, random.nextInt(3) + 1);

    }

}
