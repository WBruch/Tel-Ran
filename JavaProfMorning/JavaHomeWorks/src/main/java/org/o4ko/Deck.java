package org.o4ko;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Deck {
    private LinkedList<Card> deck;

    public Deck() {
        deck = new LinkedList<Card>();
        deck.addAll(makeShuffledDeck());
    }

    public LinkedList<Card> makeShuffledDeck() {
        LinkedList<Card> deck = new LinkedList<Card>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
        Collections.shuffle(deck,new Random());
        return deck;
    }

    public Card takeCard() {
        return deck.pollFirst();
    }

    public LinkedList<Card> getDeck() {
        return deck;
    }
}
