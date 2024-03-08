package org.example.Hard.Blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CardDeck {
    private  final List<Card> cards;

    public CardDeck(){
        cards = createDeck();
        shuffleDeck();
    }

    private  List<Card> createDeck(){
        return new ArrayList<>(Arrays.asList(
                new Card("2", 2), new Card("3", 3), new Card("4", 4),
                new Card("5", 5), new Card("6", 6), new Card("7", 7),
                new Card("8", 8), new Card("9", 9), new Card("10", 10),
                new Card("J", 10), new Card("Q", 10), new Card("K", 10),
                new Card("A", 11)
        ));

    }
    private void shuffleDeck() {
        Collections.shuffle(cards);
    }
    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }
}
