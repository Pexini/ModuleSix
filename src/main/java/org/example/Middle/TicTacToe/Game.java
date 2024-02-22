package org.example.Middle.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private Player player1;
    private Player player2;
    private Player currentPlayer;


    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;

    }

    public void playGame() {
        int moves = 0;
        boolean gameover = false;

        while (moves < 9 && !gameover) {
            printBoard();
            makeMove();
            gameover = chekForWinner();
            switchPlayer();
            moves++;
        }
        printBoard();
        if (gameover) {
            switchPlayer();
            System.out.print(currentPlayer.getName() + " Победил!");
        } else {
            System.out.println("Ничья");
        }
    }

    public void printBoard() {
        System.out.println(" 0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void makeMove() {
        Scanner scanner = new Scanner(System.in);
        boolean validMove = false;

        while (!validMove) {
            if (currentPlayer == player1) {
                System.out.print(currentPlayer.getName() + ", Введите номер строки (0-2): ");
                int row = scanner.nextInt();
                System.out.print(currentPlayer.getName() + ", Введите номер столбца (0-2): ");
                int col = scanner.nextInt();

                if (isValidMove(row, col)) {
                    board[row][col] = currentPlayer.getSymbol();
                    validMove = true;
                } else {
                    System.out.print("Некорректный ход, попробуйте снова");
                }
            } else {
                makeComputerMove();
                validMove = true;
            }
        }
    }


    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';

    }

    private void makeComputerMove() {
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!isValidMove(row, col));
        System.out.println(currentPlayer.getName() + " делает ход в " + row + " , " + col);
        board[row][col] = currentPlayer.getSymbol();
    }

    private boolean chekForWinner() {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer.getSymbol() && board[i][1] == currentPlayer.getSymbol() && board[i][2] == currentPlayer.getSymbol()) ||
                    (board[0][i] == currentPlayer.getSymbol() && board[1][i] == currentPlayer.getSymbol() && board[2][i] == currentPlayer.getSymbol())) {
                return true;
            }
        }
        if ((board[0][0] == currentPlayer.getSymbol() && board[1][1] == currentPlayer.getSymbol() && board[2][2] == currentPlayer.getSymbol()) ||
                (board[0][2] == currentPlayer.getSymbol() && board[1][1] == currentPlayer.getSymbol() && board[2][0] == currentPlayer.getSymbol())) {
                return true;
        }
        return false;
    }


    private void switchPlayer() {

        currentPlayer = (currentPlayer == player1) ? player2 : player1;

    }
}
