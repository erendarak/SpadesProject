public class Player {

    private final String identity;  //Identity of the player (computer or real player)
    private Hand hand;  //Hand of the player
    private int score; //Score of the player(initially 0)
    private int bid;  //Bid of the player



    /**
     * Constructs the player according to the identity of it
     * @param identity identity (comp or real)
     * @param hand hand (cards on the hand)
     * @param bid bid of the player
     */
    public Player(String identity, Hand hand, int score, int bid) {
        this.identity = identity;
        this.hand = hand;
        this.score = score;
        this.bid = bid;
    }

    /**
     * Plays a card in its hand with the getACard method in hand class.
     * @param hand from specified hand
     * @return played card
     */
    public Card playACard(Hand hand){
        return null;
    }

    /**
     * Displays the hand of the player.
     */
    public void showHand(){
        System.out.println(hand.toString());
    }

    /**
     * Gets who the player is.
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * Gets the hand of the specified player.
     * @return  hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Edits the hand of the specified player.
     * @param hand
     */
    public void setHand(Hand hand){
        this.hand=hand;
    }

    /**
     * Gets the points of the player.
     * @return score
     */
    public int getScore() {
        return score;
    }

    /**
     * Edits the score of the player
     * @param score
     */
    public void setScore(int score) {
        this.score=score;
    }

    /**
     * Gets the bid of the player.
     * @return
     */
    public int getBid() {
        return bid;
    }

    /**
     * Edits the bid of the player.
     * @param bid
     */
    public void setBid(int bid) {
        this.bid=bid;
    }
}
