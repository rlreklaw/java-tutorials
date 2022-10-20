package com.robonco.javatutorial.classes;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<PlayingCard> deck;

    public CardDeck() {
        deck = new ArrayList<>(52);

        for (int s : PlayingCard.SUITS) {
            for (int r : PlayingCard.RANKS) {
                deck.add(new PlayingCard(r,s));
            }
        }
    }

    public List<PlayingCard> getCards() {
        return deck;
    }

    public static void main(String[] args) {
        CardDeck deck = new CardDeck();

        for (PlayingCard c : deck.getCards()) {
            System.out.println(c);
        }
    }

}
