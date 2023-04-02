public class Card {

    private String cardName;  //The name of the card (Ace, King, Queen, Jack, 10, 9, 8, 7, 6, 5, 4, 3, 2)
    private int cardValue;  //The value of the card (Ace=14, King=13,.....,3=3, 2=2)
    private String cardSuit;  //The suit of the card (Hearts, Diamonds, Spades, and Clubs)
    private Card nextCard;  //Pointer to the next card.

    /**
     * Constructs the card with specified properties.
     * @param cardName  name of the card.
     * @param cardValue value of the card.
     * @param cardSuit  suit of the card.
     * @param nextCard  pointer to the next card.
     */
    public Card(String cardName, int cardValue, String cardSuit, Card nextCard) {
        this.cardName=cardName;
        this.cardValue=cardValue;
        this.cardSuit=cardSuit;
        this.nextCard=nextCard;
    }

    /**
     * Gets the next card.
     * @return nextCard
     */
    public Card getNextCard() {
        return nextCard;
    }

    /**
     * Edits the nextCard.
     * @param nextCard
     */
    public void setNextCard(Card nextCard) {
        this.nextCard = nextCard;
    }

    /**
     * Gets the name of the card.
     * @return cardName
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Gets the value of the card.
     * @return cardValue
     */
    public int getCardValue() {
        return cardValue;
    }

    /**
     * Gets the suit of the card.
     * @return cardSuit
     */
    public String getCardSuit() {
        return cardSuit;
    }

    /**
     * Edits the name of the card.
     * @param cardName
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * Edits the value of the card.
     * @param cardValue
     */
    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    /**
     * Edits the suit of the card.
     * @param cardSuit
     */
    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    /**
     * Prints the properties of the card.
     * @return the properties.
     */
    @Override
    public String toString() {
        return "Name: " + cardName + "\n" + "Value: " + cardValue + "\n" + "Suit: " + cardSuit;
    }
}
