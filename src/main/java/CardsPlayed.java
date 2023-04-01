public class CardsPlayed {

    private Card head;   //First played card of the ground that round.
    private Card tail;  //Last played card of the ground that round.

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
     */
    public void addCardToGround(Hand hand){

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
     */
    public void getSuitATM(){

    }



}
