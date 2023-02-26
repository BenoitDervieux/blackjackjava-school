package blackJack;

public class Dealer {

    private Hand hand = new Hand();
    private Deck deck;

    public boolean isBust() {
        return hand.getScore() > 21;
    }

    private boolean wantsToHit() {
        return hand.getScore() < 17 && !isBust();
    }

    @Override
    public String toString() {
        return "Dealer has: " + hand.getScore() + "\n" + hand;
    }

    public void play(Player player) {
        startGame(player);
        playGame(player);
        endGame(player);
    }

    private void playGame(Player player) {
        playersTurn(player);

        if (!player.isBust()) {
            dealersTurn();
        }
    }

    private void startGame(Player player) {
        deck = new Deck();
        deck.shuffle();

        dealCardTo(player);
        dealCardTo();
        dealCardTo(player);
        dealCardTo();

        System.out.println(this);
        System.out.println(player);
    }

    private void endGame(Player player) {
        if (player.isBust()) {
            System.out.println("--------------------------");
            System.out.println("Player is bust");
            System.out.println("Dealer is the winner");
        } else if (isBust()) {
            System.out.println("--------------------------");
            System.out.println("Dealer is bust");
            System.out.println("Player is the winner");
        } else {
            System.out.println("---------------------------");
            if (player.getScore() > hand.getScore()) {
                System.out.println("Player is the winner");
            } else {
                System.out.println("Dealer is the winner");
            }
        }
    }

    private void dealCardTo(Player player) {
        Card c = deck.getTopCard();
        c.show();
        player.addCard(c);
    }

    private void dealCardTo() {
        Card c = deck.getTopCard();
        c.show();
        hand.addCard(c);
    }

    private void playersTurn(Player player) {
        while(player.wantsToHit()) {
            dealCardTo(player);
            System.out.println("Player hits\n" + player);
        }
    }

    private void dealersTurn() {
        while(wantsToHit()) {
            dealCardTo();
            System.out.println("Dealer hits!\n" + this);
        }
    }
    
}
