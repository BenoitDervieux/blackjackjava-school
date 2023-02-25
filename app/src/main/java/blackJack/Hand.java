package blackJack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards = new ArrayList <>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getScore() {
        int[] cardScores = new int[Value.values().length];
        cardScores[Value.Ace.ordinal()] = 11;
        cardScores[Value.Two.ordinal()] = 2;
        cardScores[Value.Three.ordinal()] = 3;
        cardScores[Value.Four.ordinal()] = 4;
        cardScores[Value.Five.ordinal()] = 5;
        cardScores[Value.Six.ordinal()] = 6;
        cardScores[Value.Seven.ordinal()] = 7;
        cardScores[Value.Eight.ordinal()] = 8;
        cardScores[Value.Nine.ordinal()] = 9;
        cardScores[Value.Ten.ordinal()] = 10;
        cardScores[Value.Jack.ordinal()] = 10;
        cardScores[Value.Queen.ordinal()] = 10;
        cardScores[Value.King.ordinal()] = 10;

        int score = 0;

        for (Card c : cards) {
            score += cardScores[c.getValue().ordinal()];
        }

        if (score > 21) {
            for (Card c : cards) {
                if (c.getValue() == Value.Ace && score > 21) {
                    score -= 10;
                }
            }
        }
        return score;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Card c : cards) {
            str.append(c);
            str.append("\n");
        }

        return str.toString();
    }
    
}
