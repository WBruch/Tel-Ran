package org.o4ko;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public int calculatedValue() {
        int value = 0;
        for (Card card : hand) {
            value += card.getValue();
        }
        return value;
    }

    public void takeCardFromDeck(Deck deck) {
        hand.add(deck.takeCard());
    }

    public void clear(){
        hand.clear();
    }

    @Override
    public String toString() {
        String result = "";
        for (Card current :
                hand) {
            result += current + " - ";
        }
        return result;
    }
}

