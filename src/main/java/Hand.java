public class Hand {

    private Node cards;  //Cards in the linked list of the hand
    private LinkedList handDeck;  //Linked list of cards in the hand
    private int numberOfCardsATM;  //Number of cards at that time
    private int numberOfCardsN;  //Number of cards normally 13

    /**
     * Constructs the hand class for specified properties to have 13 cards for everyone.
     * @param numberOfCardsN 13
     */
    public Hand(int numberOfCardsN) {

    }

    /**
     * Adds card to the hand with the getFirstCardOfDeck method of the given deck.
     * @param deck given deck
     */
    public void addCard(Deck deck){

    }

    /**
     * Deletes card from the hand
     * @param no index of linked list
     */
    public void deleteCard(int no){

    }

    /**
     * Gets the number of the cards at that moment
     * @return number of the cards at that moment
     */
    public int getNumberOfCardsATM(){

    }

    /**
     * Displays the hand of the player.
     * @param player specified player
     */
    public void showHand(Player player){

    }

    /**
     * Gets the specified card from the hand to play.
     * @param handDeck linked list of the cards in the hand
     */
    public void getACard(LinkedList handDeck){

    }
}
