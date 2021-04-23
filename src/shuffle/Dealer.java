package shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {

    public Deck shuffle(Deck deck) {
        List<Card> firstHalf = deck.deck.subList(0, Deck.DECK_SIZE/2);
        List<Card> secondHalf = deck.deck .subList(Deck.DECK_SIZE/2, Deck.DECK_SIZE);
        List<Card> shuffled = new ArrayList<>();
        for (int i = 0; i < Deck.DECK_SIZE/2; i++) {
            shuffled.add(firstHalf.get(i));
            shuffled.add(secondHalf.get(i));
        }
        return new Deck(shuffled);
    }

    private List<Card> dealSuit(Suits suit) {
        List<Card> cards = new ArrayList<>();
        for (int i = 1; i < 14; i++) {
            Card card = new Card(i, suit);
            cards.add(card);
        }
        return cards;
    }

    private Deck stackDeck(List<Card> spades, List<Card> diamonds, List<Card> clubs, List<Card> hearts) {
        List<Card> deck = new ArrayList<>();
        deck.addAll(spades);
        deck.addAll(diamonds);
        deck.addAll(clubs);
        deck.addAll(hearts);
        return new Deck(deck);
    }

    public Deck dealNewDeckOrder() {
        List<Card> spades = dealSuit(Suits.SPADES);
        List<Card> diamonds = dealSuit(Suits.DIAMONDS);
        List<Card> clubs = dealSuit(Suits.CLUBS);
        List<Card> hearts = dealSuit(Suits.HEARTS);
        Collections.reverse(clubs);
        Collections.reverse(hearts);
        return stackDeck(spades, diamonds, clubs, hearts);
    }

}
