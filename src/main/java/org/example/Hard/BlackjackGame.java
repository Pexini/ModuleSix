package org.example.Hard;

import java.util.Scanner;


    class BlackjackGame {
        private final CardDeck deck;
        private int playerScore;
        private int dealerScore;

        public BlackjackGame() {
            deck = new CardDeck();
            playerScore = 0;
            dealerScore = 0;
        }

        public void playGame() {
            dealInitialCards();
            showInitialHands();

            while (playerScore < 21) {
                if (wantToHit()) {
                    hitPlayer();
                    showHands();
                } else {
                    break;
                }
            }

            // Dealer's turn
            dealerTurn();

            // Determine the winner
            determineWinner();
        }

        private void dealInitialCards() {
            playerScore = 0;
            dealerScore = 0;

            for (int i = 0; i < 2; i++) {
                playerScore += deck.dealCard().getValue();
                dealerScore += deck.dealCard().getValue();
            }
        }

        private void showInitialHands() {
            System.out.println("Ваши карты: " + playerScore);
            System.out.println("Карты дилера: " + deck.dealCard() + " и еще одна карта, скрытая");
        }

        private boolean wantToHit() {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Желаете взять еще карту? (y/n): ");
                String choice = scanner.nextLine().toLowerCase();
                return "y".equals(choice);
            }
        }

        private void hitPlayer() {
            playerScore += deck.dealCard().getValue();
        }

        private void showHands() {
            System.out.println("Ваши карты: " + playerScore);
            System.out.println("Карта дилера: " + deck.dealCard());
        }

        private void dealerTurn() {
            while (dealerScore < 17) {
                dealerScore += deck.dealCard().getValue();
            }
        }

        private void determineWinner() {
            System.out.println("Ваши карты: " + playerScore);
            System.out.println("Карты дилера: " + dealerScore);

            if (playerScore > 21 || (dealerScore <= 21 && dealerScore > playerScore)) {
                System.out.println("Дилер выиграл!");
            } else if (dealerScore > 21 || playerScore > dealerScore) {
                System.out.println("Вы выиграли!");
            } else {
                System.out.println("Ничья!");
            }
        }
    }

