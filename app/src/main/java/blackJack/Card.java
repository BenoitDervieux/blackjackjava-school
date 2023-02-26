package blackJack;

public class Card {
    private Colour color;
    private Value value;
    private boolean isHidden;

    public Card(Colour c, Value v) {
        color = c;
        value = v;
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
        return color;
    }

    public Value getValue() {
        if (isHidden) {
            return Value.Hidden;
        }
        return value;
    }

    @Override
    public String toString() {
        return  getValue() + " of " + getColour();
    }
    
}
