import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Suit {
    HEARTS("Hearts"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs"),
    SPADES("Spades");

    private final String name;

    Suit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Card {
    private final Suit suit;
    private final int value;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        String faceValue;
        switch (value) {
            case 1:
                faceValue = "Ace";
                break;
            case 11:
                faceValue = "Jack";
                break;
            case 12:
                faceValue = "Queen";
                break;
            case 13:
                faceValue = "King";
                break;
            default:
                faceValue = String.valueOf(value);
        }
        return faceValue + " of " + suit;
    }
}
