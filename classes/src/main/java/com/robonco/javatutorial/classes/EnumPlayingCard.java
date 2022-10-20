package com.robonco.javatutorial.classes;

public class EnumPlayingCard {
    private final CardSuit suit;
    private final CardRank rank;

    public enum CardRank {
        ACE("Ace"),
        DEUCE("Deuce"),
        THREE("Three"),
        FOUR("Four"),
        FIVE("Five"),
        SIX("Six"),
        SEVEN("Seven"),
        EIGHT("Eight"),
        NINE("Nine"),
        TEN("Ten"),
        JACK("Jack"),
        QUEEN("Queen"),
        KING("King");

        private final String label;

        CardRank(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public enum CardSuit {
        SPADES("Spades"),
        CLUBS("Clubs"),
        HEARTS("Hearts"),
        DIAMONDS("Diamonds");

        private final String label;

        CardSuit(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    public EnumPlayingCard(CardRank rank, CardSuit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public CardRank getRank() {
        return rank;
    }

    @Override
    public String toString() {

//        return String.format("%s of %s", rank.getLabel(), suit.getLabel());
        return String.format("%s of %s", rank, suit);

    }

    public static void main(String[] args) {
        EnumPlayingCard card1 = new EnumPlayingCard(CardRank.ACE, CardSuit.SPADES);
        System.out.println(card1);

        card1 = new EnumPlayingCard(CardRank.KING, CardSuit.CLUBS);
        System.out.println(card1);

        card1 = new EnumPlayingCard(CardRank.DEUCE, CardSuit.DIAMONDS);
        System.out.println(card1);

        card1 = new EnumPlayingCard(CardRank.QUEEN, CardSuit.HEARTS);
        System.out.println(card1);

    }

}
