public class Gameplay {

    private Player computer1,computer2,computer3,realPlayer;
    private Deck deck;
    private CardsPlayed cardsPlayed;

    /**
     * Constructs the game for the players with the deck.
     * @param computer1 1st AI
     * @param computer2 2nd AI
     * @param computer3 3rd AI
     * @param realPlayer real player
     * @param deck  deck of the game
     * @param cardsPlayed cards played to the ground that round
     */
    public Gameplay(Player computer1, Player computer2, Player computer3, Player realPlayer, Deck deck, CardsPlayed cardsPlayed){

    }

    /**
     * Gets the first computer player.
     * @return computer1
     */
    public Player getComputer1() {

    }

    /**
     * Edits the first computer player.
     * @param computer1
     */
    public void setComputer1(Player computer1) {

    }

    /**
     * Gets the second computer player.
     * @return  computer2
     */
    public Player getComputer2() {

    }

    /**
     * Edits the first computer player.
     * @param computer2
     */
    public void setComputer2(Player computer2) {

    }

    /**
     * Gets the third computer player.
     * @return computer3
     */
    public Player getComputer3() {

    }

    /**
     * Edits the first computer player.
     * @param computer3
     */
    public void setComputer3(Player computer3) {

    }

    /**
     * Gets the first real player.
     * @return
     */
    public Player getRealPlayer() {

    }

    /**
     * Edits the first real player.
     * @param realPlayer
     */
    public void setRealPlayer(Player realPlayer) {

    }

    /**
     * Gets the deck of the game.
     * @return deck
     */
    public Deck getDeck() {

    }

    /**
     * Edits the deck of the game.
     * @param deck
     */
    public void setDeck(Deck deck) {

    }

    /**
     * Gets the cards which played to the ground(linked list of cards).
     * @return cardsPlayed
     */
    public CardsPlayed getCardsPlayed() {

    }

    /**
     * Edits the cards which played to the ground(linked list of cards).
     * @param cardsPlayed
     */
    public void setCardsPlayed(CardsPlayed cardsPlayed) {

    }

    /**
     * Deals the cards to the order.
     * @param deck deck of the game
     * @param hand  all player's hands
     */
    public void dealCards(Deck deck, Hand hand){

    }

    /**
     * Takes the bids from the players.
      */
    public void takeBids(){

    }

    /**
     * Puts players to an order to play the game.
     */
    public void arrangePlayers(){

    }

    /**
     * First player plays in order to determine the first suit of the game.
     */
    public void firstPlayerPlays(){

    }

    /**
     * After taking the bids, first player starts the round and every player plays a card according to the proper suit(if they have).
     */
    public void playARound(){

    }

    /**
     * After every player plays a card, this method determines the biggest value in the ground(cardsPlayed) with biggest suit.
     * @return winner player of the round
     */
    public Player determineRoundWinner(){

    }

    /**
     * This method adds points to the winner player of the round according to the given rules.
     */
    public void arrangeScore(){

    }

    /**
     * This method determines the winner who reaches 500 points.
     */
    public void determineGameWinner{

    }

    /**
     * This method will finish the game if one of the players have been reached 500 points.
     */
    public void endGame(){

    }
}
