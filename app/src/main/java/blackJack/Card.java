package blackJack;

public class Card {
    private Colour color;
    private Value value;
    private boolean isHidden;

    public Card(Colour color, Value value) {
        this.color = color;
        this.value = value;
        isHidden = true;
    }

    public void show() {
        isHidden = false;
    }

    public void hide() {
        isHidden = true;
    }

    public Colour getColour() {
        if (isHidden) {
            return Colour.Hidden;
        }
        return this.color;
    }

    public Value getValue() {
        if (isHidden) {
            return Value.Hidden;
        }
        return this.value;
    }

    @Override
    public String toString() {
        return  getColour() + " of " + getValue();
    }
    
}
