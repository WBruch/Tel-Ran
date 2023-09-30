package org.o4ko;

import java.util.LinkedList;

public class Game {
    private Deck deck;
    private Dealer dealer;
    private Player player;
    private int wins, losses, pushes;

    public Game() {

        deck = new Deck();
        dealer = new Dealer();
        player = new Player();

        while (dealer.getBank() != 0 && player.getBank() != 0) {

            startGame();
            gameInfo();
            deck = new Deck();
        }
    }

    private void gameInfo() {
        System.out.println("Starting Next Round... Wins: " + wins + " Losses: " + losses +
                " Pushes: " + pushes + " Bank: " + player.getBank());
    }

    private void startGame() {
        dealer.setBank(dealer.getBank() - 10);
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);
        dealer.printHand();

        player.setBank(player.getBank() - 10);
        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);
        player.printHand();
        player.makeDecision(deck);


        if (dealer.getHand().calculatedValue() < 19) {
            dealer.getHand().takeCardFromDeck(deck);
            dealer.printHand();
        }

        int playerResult = player.getHand().calculatedValue();
        int dealerResult = dealer.getHand().calculatedValue();

        if (dealerResult>21 && playerResult>21) {
            System.out.println("Game draw");
            player.setBank(dealer.getBank() + 10);
            dealer.setBank(dealer.getBank() + 10);
            pushes++;
        }
       else if (dealerResult>21) {
            System.out.println("Congratulations, you win!");
            player.setBank(dealer.getBank() + 20);
            wins++;
        }
      else if (playerResult == dealerResult) {
            System.out.println("Game draw");
            player.setBank(dealer.getBank() + 10);
            dealer.setBank(dealer.getBank() + 10);
            pushes++;
        }else if (playerResult > 21) {
            System.out.println("You have gone over 21. You lose");
            dealer.setBank(dealer.getBank() + 20);
            losses++;

        } else if (playerResult == 21) {
            System.out.println("You have Blackjack! You win!");
            wins++;
        } else if (playerResult < dealerResult && dealerResult < 21) {
            System.out.println("You lose");
            dealer.setBank(dealer.getBank() + 20);
            losses++;

        } else {
            System.out.println("Congratulations, you win!");
            player.setBank(dealer.getBank() + 20);
            wins++;
        }
        player.getHand().clear();
        dealer.getHand().clear();

    }


}
