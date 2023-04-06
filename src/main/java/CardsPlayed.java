public class CardsPlayed {

    private Card head;   //First played card of the ground that round.
    private Card tail;  //Last played card of the ground that round.
    private int numberOfCardsATM=0; //Shows the number of cards at the moment.

    /**
     * Constructs the cards played to the ground.
     * @param head first card played that round (head)
     * @param tail last card played that round (tail)
     */

    public CardsPlayed(Card head, Card tail){
        this.head=head;
        this.tail=tail;
    }

    /**
     * Gets a card from the hand of the player,which will be played.
     * @param hand player's hand
     * @param no   given index
     */
    public void addCardToGround(Hand hand,int no){
            Card x = new Card(hand.searchCard(no).getCardName(),hand.searchCard(no).getCardValue(),hand.searchCard(no).getCardSuit(),hand.searchCard(no).getNextCard());
            if (head == null){
                head=x;
            } else {
                tail.setNextCard(x);
            }
            tail = x;
            x.setNextCard(null);
            numberOfCardsATM++;
    }

    /**
     * Gets the first card played to the ground.
     * @return head
     */
    public Card getHead() {
        return head;
    }

    /**
     * Edits the first card played to the ground.
     * @param head
     */
    public void setHead(Card head) {
        this.head=head;
    }

    /**
     * Gets the last card played to the ground.
     * @return tail
     */
    public Card getTail() {
        return tail;
    }

    /**
     * Edits the first card played to the ground.
     * @param tail
     */
    public void setTail(Card tail) {
        this.tail=tail;
    }

    /**
     * Gets the suit at the moment for the players to play it.
     * @return  suit of the last card
     */
    public String getSuitATM(){
        if(tail!=null){
            return tail.getCardSuit();
        }
        return null;
    }

    /**
     * Prints the properties of the hand.
     * @return cards in the hand
     */
    @Override
    public String toString() {
        String toString = "Cards in the ground:\n";
        Card temp = head;
        while(temp!=null){
            toString += temp.getCardName() + " of ";
            toString += temp.getCardSuit() + " " + "(";
            toString += temp.getCardValue() + ")" + "\n";
            temp = temp.getNextCard();
        }
        return toString;
    }



}
