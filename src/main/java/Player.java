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

    }

    /**
     * Plays a card in its hand with the getACard method in hand class.
     * @param hand from specified hand
     * @return played card
     */
    public Card playACard(Hand hand){

    }

    /**
     * Displays the hand of the player.
     * @param hand specified player
     */
    public void showHand(Hand hand){

    }

    /**
     * Gets who the player is.
     * @return identity
     */
    public String getIdentity() {

    }

    /**
     * Gets the hand of the specified player.
     * @return  hand
     */
    public Hand getHand() {

    }

    /**
     * Edits the hand of the specified player.
     * @param hand
     */
    public void setHand(Hand hand){

    }

    /**
     * Gets the points of the player.
     * @return score
     */
    public int getScore() {

    }

    /**
     * Edits the score of the player
     * @param score
     */
    public void setScore(int score) {

    }

    /**
     * Gets the bid of the player.
     * @return
     */
    public int getBid() {

    }

    /**
     * Edits the bid of the player.
     * @param bid
     */
    public void setBid(int bid) {

    }
}
