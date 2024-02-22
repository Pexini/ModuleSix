package org.example.Middle.Stones;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();

        System.out.println("Привет друзья. Давайте сыграем в игру \"Камушки\". Суть такова: ");
        System.out.println( "Я загодал число от 1 до 100, если сумма названных Вами чисел будет больше числа которое я загадал, вы проиграли. ");
        System.out.println("Игрок 1 - введите ваше имя :");
        String player1 = scanner.nextLine();
        System.out.println("Игрок 2 - введите ваше имя :");
        String player2 = scanner.nextLine();

    }

}
