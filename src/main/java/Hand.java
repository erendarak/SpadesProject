public class Hand {

    private Card head;   //First element of the hand list.
    private Card tail;  //Last element of the hand list.
    private int numberOfCardsATM;  //Number of cards at that time
    private int numberOfCardsN;  //Number of cards normally 13

    /**
     * Constructs the hand class for specified properties to have 13 cards for everyone.
     * @param head head
     * @param tail  tail
     * @param numberOfCardsATM numberOfCardsATM
     * @param numberOfCardsN numberOfCardsN
     */
    public Hand(Card head, Card tail, int numberOfCardsATM, int numberOfCardsN) {
        this.head = head;
        this.tail = tail;
        this.numberOfCardsATM = numberOfCardsATM;
        this.numberOfCardsN = numberOfCardsN;
    }

    /**
     * Adds card to the hand with the getFirstCardOfDeck method of the given deck.
     * @param deck given deck
     */
    public void addCardToHand(Deck deck){

    }

    /**
     * Deletes card from the hand
     * @param no index of linked list
     */
    public void deleteCard(int no){

    }


    /**
     * Gets the first element of the hand(card).
     * @return head
     */
    public Card getHead() {
        return head;
    }

    /**
     * Edits the first element of the hand(card).
     * @param head
     */
    public void setHead(Card head) {
        this.head=head;
    }

    /**
     * Gets the last element of the hand(card).
     * @return tail
     */
    public Card getTail() {
        return tail;
    }

    /**
     * Edits the last element of the hand(card).
     * @param tail
     */
    public void setTail(Card tail) {
        this.tail=tail;
    }

    /**
     * Gets the number of the cards at that moment
     * @return number of the cards at that moment
     */
    public int getNumberOfCardsATM(){
        return numberOfCardsATM;
    }

    /**
     * Sorts the hand from least to highest.
     */
    public void sortHand(){

    }

    /**
     * Searches for a card which is requested.
     * @param card wanted card
     * @return requested card
     */
    public Card searchCard(Card card){
        return null;
    }

    /**
     * Prints the properties of the hand.
     * @return cards in the hand
     */
    @Override
    public String toString() {
        return null;
    }
}
