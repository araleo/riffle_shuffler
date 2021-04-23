package shuffle;

public class Main {

    public static void main(String[] args) {

        Dealer dealer = new Dealer();
        Deck deck = dealer.dealNewDeckOrder();
        printDeck(deck);
        for (int i = 0; i < 10; i++) {
            System.out.println("*** Shuffle #" + i +  " ***");
            deck = dealer.shuffle(deck);
            printDeck(deck);
        }
    }

    private static void printDeck(Deck deck) {
        for (Card c : deck.deck) {
            System.out.println(c);
        }
    }

}
