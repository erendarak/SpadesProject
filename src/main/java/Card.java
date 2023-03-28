public class Card {

    private final String cardName;  //The name of the card (Ace, King, Queen, Jack, 10, 9, 8, 7, 6, 5, 4, 3, 2)
    private final int cardValue;  //The value of the card (Ace=14, King=13,.....,3=3, 2=2)
    private final String cardSuit;  //The suit of the card (Hearts, Diamonds, Spades, and Clubs)

    private Card nextCard;  //Pointer to the next card.

    /**
     * Constructs the card with specified properties.
     * @param cardName  name of the card.
     * @param cardValue value of the card.
     * @param cardSuit  suit of the card.
     * @param nextCard  pointer to the next card.
     */
    public Card(String cardName, int cardValue, String cardSuit, Card nextCard) {

    }

    /**
     * Gets the next card.
     * @return nextCard
     */
    public Card getNextCard() {

    }

    /**
     * Edits the nextCard.
     * @param nextCard
     */
    public void setNextCard(Card nextCard) {

    }

    /**
     * Prints the properties of the card.
     * @return the properties.
     */
    @Override
    public String toString() {

    }
}
