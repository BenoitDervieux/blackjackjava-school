package blackJack;

import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();

        for (int coulourIndex = 0; coulourIndex < Colour.Count.ordinal(); coulourIndex++) {
            for (int valueIndex = 0; valueIndex < Value.Count.ordinal(); valueIndex++) {
                Card c = new Card(Colour.values()[coulourIndex], Value.values()[valueIndex]);
                cards.add(c);
            }
        }
    }

    private Card getRandomCard() {
        int index = (int) (Math.random() * 171717.0) % cards.size();
        Card c = cards.get(index);
        cards.remove(index);
        return c;
    }

    public void shuffle() {
        for (int i = 0; i < 1017; i++) {
            Card c = getRandomCard();
            cards.add(c);
        }
    }

    public Card getTopCard() {
        Card c = cards.get(0);
        cards.remove(0);
        return c;
    }
  
    
}
