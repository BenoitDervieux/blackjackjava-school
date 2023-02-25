package blackJack;

public class Player {

    private Hand hand = new Hand();

    public void addCard(Card card) {
        hand.addCard(card);
    }

    public boolean wantsToHit() {
        return hand.getScore() < 19;
    }

    public boolean isBust() {
        return hand.getScore() > 21;
    }
    
    public int getScore() {
        return hand.getScore();
    }

    @Override
    public String toString() {
        return "Player has: " + getScore() + "\n" + hand;
    }
}
