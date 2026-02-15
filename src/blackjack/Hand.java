package blackjack;

import java.util.ArrayList;

public class Hand {

    public ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void clear() {
        hand.clear();
    }

    public void addCard(Card c) {
        if (c == null)
            throw new NullPointerException("Can't add a null card to a hand.");
            hand.add(c);
    }

    public void removeCard(Card c) {
        hand.remove(c);
    }

    public int getCardCount() {
        return hand.size();
    }

    public Card getCard(int position) {
        if (position >=0 && position < hand.size())
            return hand.get(position);
        else
            return null;
    }

    public int getBlackjackValue() {
        int val = 0;
        boolean ace = false;
                int cards = getCardCount();

        for (int i = 0; i < cards; i++) {
            Card card = getCard(i);
            int cardVal = card.getBlackjackValue();
            if (cardVal == 1)
                ace = true;
                        val = val + cardVal;
        }

        if (ace == true && val + 10 <= 21)
            val = val + 10;

        return val;
    }
}