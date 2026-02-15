package blackjack;

public class Card {

    public static final int SPADES = 0;
    public static final int HEARTS = 1;
    public static final int DIAMONDS = 2;
    public final static int CLUBS = 3;

    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    private final int suit;
    private final int value;

    public Card(int theValue, int theSuit) {
        value = theValue;
        suit = theSuit;
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public int getBlackjackValue() {
        if (value > 10)
            return 10;
        else
            return value;
    }

    public String toString() {
        String suitName;
        if (suit == SPADES)
            suitName = "Spades";
        else if (suit == HEARTS)
            suitName = "Hearts";
        else if (suit == DIAMONDS)
            suitName = "Diamonds";
        else
            suitName = "Clubs";

        String valueName;
        if (value == ACE)
            valueName = "Ace";
        else if (value == JACK)
            valueName = "Jack";
        else if (value == QUEEN)
            valueName = "Queen";
        else if (value == KING)
            valueName = "King";
        else
            valueName = "" + value;

        return valueName + " of " + suitName;
    }
}
