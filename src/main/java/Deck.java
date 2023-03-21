public class Deck {

    private final String[] suit; //= {"Spade", "Club", "Heart", "Diamond"};
    private final String[] name; //= {"A", "2", "3", "4","5", "6", "7", "8","9", "10", "J", "Q","K"};;
    private int numberOfCards;  //Number of the cards in the deck at that time. Its normally 52.
    private Card[] cards;  //Array of all the cards

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
}
