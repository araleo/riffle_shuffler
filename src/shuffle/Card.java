package shuffle;

public class Card {

    private final int value;
    private final Suits suit;

    public Card(int value, Suits suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}

