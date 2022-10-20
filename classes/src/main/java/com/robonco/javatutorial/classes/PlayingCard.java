package com.robonco.javatutorial.classes;

public class PlayingCard {
    private final int suit;
    private final int rank;

    static public final int ACE   = 1;
    static public final int DEUCE = 2;
    static public final int THREE = 3;
    static public final int FOUR  = 4;
    static public final int FIVE  = 5;
    static public final int SIX   = 6;
    static public final int SEVEN = 7;
    static public final int EIGHT = 8;
    static public final int NINE  = 9;
    static public final int TEN   = 10;
    static public final int JACK  = 11;
    static public final int QUEEN = 12;
    static public final int KING  = 13;

    static public final int[] RANKS = {
            ACE,
            DEUCE,
            THREE,
            FOUR,
            FIVE,
            SIX,
            SEVEN,
            EIGHT,
            NINE,
            TEN,
            JACK,
            QUEEN,
            KING
    };

    static public final int SPADES   = 100;
    static public final int CLUBS    = 200;
    static public final int HEARTS   = 300;
    static public final int DIAMONDS = 400;

    static public final int[] SUITS = {
            SPADES,
            CLUBS,
            HEARTS,
            DIAMONDS
    };

    public PlayingCard(int rank, int suit) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        String suitName = "";
        String rankName = "";

        switch (suit) {
            case SPADES:
                suitName = "Spades";
                break;
            case CLUBS:
                suitName = "Clubs";
                break;
            case HEARTS:
                suitName = "Hearts";
                break;
            case DIAMONDS:
                suitName = "Diamonds";
                break;
            default:
                suitName = "Invalid Suit";
        }

        switch (rank) {
            case ACE:
                rankName = "Ace";
                break;
            case DEUCE:
                rankName = "Deuce";
                break;
            case THREE:
                rankName = "Three";
                break;
            case FOUR:
                rankName = "Four";
                break;
            case FIVE:
                rankName = "Five";
                break;
            case SIX:
                rankName = "Six";
                break;
            case SEVEN:
                rankName = "Seven";
                break;
            case EIGHT:
                rankName = "Eight";
                break;
            case NINE:
                rankName = "Nine";
                break;
            case TEN:
                rankName = "Ten";
                break;
            case JACK:
                rankName = "Jack";
                break;
            case QUEEN:
                rankName = "Queen";
                break;
            case KING:
                rankName = "King";
                break;
            default:
                rankName = "Invalid Rank";
        }

        return String.format("%s of %s", rankName, suitName);

    }

    public static void main(String[] args) {
        PlayingCard card1 = new PlayingCard(ACE, SPADES);
        System.out.println(card1);

        card1 = new PlayingCard(KING, CLUBS);
        System.out.println(card1);

        card1 = new PlayingCard(DEUCE, DIAMONDS);
        System.out.println(card1);

        card1 = new PlayingCard(QUEEN, HEARTS);
        System.out.println(card1);

        card1 = new PlayingCard(666, 666);
        System.out.println(card1);
    }

}
