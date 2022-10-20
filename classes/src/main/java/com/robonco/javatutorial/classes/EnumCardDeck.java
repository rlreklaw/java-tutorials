package com.robonco.javatutorial.classes;

import java.util.ArrayList;
import java.util.List;

public class EnumCardDeck {
    private List<EnumPlayingCard> deck;

    public EnumCardDeck() {
        deck = new ArrayList<>(52);

        for (EnumPlayingCard.CardSuit s : EnumPlayingCard.CardSuit.values()) {
            for (EnumPlayingCard.CardRank r : EnumPlayingCard.CardRank.values()) {
                deck.add(new EnumPlayingCard(r,s));
            }
        }
    }

    public List<EnumPlayingCard> getCards() {
        return deck;
    }

    public static void main(String[] args) {
        EnumCardDeck deck = new EnumCardDeck();

        for (EnumPlayingCard c : deck.getCards()) {
            System.out.println(c);
        }
    }

}
