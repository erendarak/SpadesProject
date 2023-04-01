public class Deck {

    private Card head;   //First element of the deck list.
    private Card tail;  //Last element of the deck list.
    private int numberOfCards;  //Number of the cards in the deck at that time. Its normally 52.

    /**
     * Constructs the deck (linked list).
     * @param head head
     * @param tail  tail
     * @param numberOfCards numberOfCards
     */
    public Deck(Card head, Card tail, int numberOfCards) {
        this.head=head;
        this.tail=tail;
        this.numberOfCards=numberOfCards;
    }

    /**
     * This method creates the deck with a nested for loop for all suits and values.
     * @param value given value
     * @param suit  given suit
     */
    public void addCardtoDeck(int value, String suit){

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
    public Card getFirstCard(){

    }

    /**
     * Deletes the first card of the deck.
     */
    public void deleteFirstCard(){

    }

    /**
     * Gets the number of the cards at the deck.
     * @return numberOfCards
     */
    public int getNumberOfCards() {
        return numberOfCards;
    }

    /**
     * Edits the number of the cards at the deck.
     * @param numberOfCards
     */
    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards=numberOfCards;
    }

    /**
     * Gets the first element of the deck(card).
     * @return head
     */
    public Card getHead() {
        return head;
    }

    /**
     * Edits the first element of the deck(card).
     * @param head
     */
    public void setHead(Card head) {
        this.head=head;
    }

    /**
     * Gets the last element of the deck(card).
     * @return tail
     */
    public Card getTail() {
        return tail;
    }

    /**
     * Edits the first element of the deck(card).
     * @param tail
     */
    public void setTail(Card tail) {
        this.tail=tail;
    }


}
