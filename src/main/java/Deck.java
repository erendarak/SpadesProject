public class Deck {

    private Card head;   //First element of the deck list.
    private Card tail;  //Last element of the deck list.
    private final String[] suit; //= {"Spade", "Club", "Heart", "Diamond"};
    private final String[] name; //= {"2", "3", "4","5", "6", "7", "8","9", "10", "J", "Q","K", "A"};;
    private int numberOfCards;  //Number of the cards in the deck at that time. Its normally 52.


    /**
     * Constructor of the deck. (Head, tail, size)
     */
    public Deck() {

    }

    /**
     * This method creates the deck with a nested for loop using suit and name arrays.
     */
    public void addCardtoDeck(){

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
    public Card getFirstCardOfDeck(){

    }

    /**
     * Gets the number of the cards at the deck.
     * @return numberOfCards
     */
    public int getNumberOfCards() {

    }

}
