package org.o4ko;

import java.util.Scanner;

public class Player extends Person {
    Scanner input = new Scanner(System.in);

    public Player() {
        super.setName("Player");
        super.setBank(100);
    }

    public void makeDecision(Deck deck) {
        System.out.println("Would you like to: 1) Hit or 2) Stand");
        int decision = input.nextInt();

        if (decision == 1) {
            this.getHand().takeCardFromDeck(deck);
            this.printHand();
        } else {
            System.out.println("You stand.");
        }
    }

}
