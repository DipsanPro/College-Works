import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDealer {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();

        // Populate the deck with all 52 cards
        for (Suit suit : Suit.values()) {
            for (int value = 1; value <= 13; value++) {
                deck.add(new Card(suit, value));
            }
        }

        // Shuffle the deck
        Collections.shuffle(deck);

        // Deal the first five cards
        List<Card> hand = deck.subList(0, 5);

        // Display the dealt cards
        System.out.println("Dealt cards:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}