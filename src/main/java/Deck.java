public class Deck {

    private final String[] suit; //= {"Spade", "Club", "Heart", "Diamond"};
    private final String[] name; //= {"A", "2", "3", "4","5", "6", "7", "8","9", "10", "J", "Q","K"};;
    private int numberOfCards;  //Number of the cards in the deck at that time. Its normally 52.
    private LinkedList cards;  //Linked List of all the cards

    /**
     * Constructor of the deck. 52 cards will be added to the deck.
     */
    public Deck() {

    }

    /**
     * This method will shuffle our deck in order to play the game fairly.
     * @param deck
     */
    public void shuffle(Deck deck){

    }

    /**
     * Gets the first card of the deck so that Hand class can add cards to the hands of the players.
     * @return the card(node)
     */
    public Node getFirstCardOfDeck(){

    }

    /**
     * Gets the number of the cards at the deck.
     * @return numberOfCards
     */
    public int getNumberOfCards() {

    }

    /**
     * Sorts the hand.
     */
    public void sortHand(){

    }
}
