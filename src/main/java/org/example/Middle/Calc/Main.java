package org.example.Middle.Calc;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите одно из арифметических действией : ( + ; - ; * ; /) :");
        char choise = scanner.next().charAt(0);
        System.out.println("Введите значение первого аргумента :");
        double arg1 = scanner.nextDouble();
        System.out.println("Введите значение второго аргумента :");
        double arg2 = scanner.nextDouble();
        double result = 0;

        switch (choise) {
            case '+':
                result = add(arg1, arg2);
                break;
            case '-':
                result = minus(arg1, arg2);
                break;
            case '*':
                result = multiply(arg1, arg2);
                break;
            case '/':
                result = divide(arg1, arg2);
                break;
            default:
                System.out.println("Неверная опция");
                System.exit(0);

        }
        System.out.println("Результат " + result);

    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0 ) {
            return a / b;
        } else {
            System.out.println("Делить на 0 нельзя");
            System.exit(0);
            return 0;
        }
    }
}
