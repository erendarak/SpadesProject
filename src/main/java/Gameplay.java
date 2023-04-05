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
    public Gameplay(Player computer1, Player computer2, Player computer3, Player realPlayer, Deck deck, CardsPlayed cardsPlayed) {
        this.computer1 = computer1;
        this.computer2 = computer2;
        this.computer3 = computer3;
        this.realPlayer = realPlayer;
        this.deck = deck;
        this.cardsPlayed = cardsPlayed;
    }

    /**
     * Gets the first computer player.
     * @return computer1
     */
    public Player getComputer1() {
        return computer1;
    }

    /**
     * Edits the first computer player.
     * @param computer1
     */
    public void setComputer1(Player computer1) {
        this.computer1=computer1;
    }

    /**
     * Gets the second computer player.
     * @return  computer2
     */
    public Player getComputer2() {
        return computer2;
    }

    /**
     * Edits the first computer player.
     * @param computer2
     */
    public void setComputer2(Player computer2) {
        this.computer2=computer2;
    }

    /**
     * Gets the third computer player.
     * @return computer3
     */
    public Player getComputer3() {
        return computer3;
    }

    /**
     * Edits the first computer player.
     * @param computer3
     */
    public void setComputer3(Player computer3) {
        this.computer3=computer3;
    }

    /**
     * Gets the first real player.
     * @return
     */
    public Player getRealPlayer() {
        return realPlayer;
    }

    /**
     * Edits the first real player.
     * @param realPlayer
     */
    public void setRealPlayer(Player realPlayer) {
        this.realPlayer=realPlayer;
    }

    /**
     * Gets the deck of the game.
     * @return deck
     */
    public Deck getDeck() {
        return deck;
    }

    /**
     * Edits the deck of the game.
     * @param deck
     */
    public void setDeck(Deck deck) {
        this.deck=deck;
    }

    /**
     * Gets the cards which played to the ground(linked list of cards).
     * @return cardsPlayed
     */
    public CardsPlayed getCardsPlayed() {
        return cardsPlayed;
    }

    /**
     * Edits the cards which played to the ground(linked list of cards).
     * @param cardsPlayed
     */
    public void setCardsPlayed(CardsPlayed cardsPlayed) {
        this.cardsPlayed=cardsPlayed;
    }

    /**
     * Deals the cards to the order.
     * @param hand  all player's hands
     */
    public void dealCards(Hand hand,String identity){
        switch (identity){
            case "Computer1":
                hand.addCardToHand1(deck);
            case "Computer2":
                hand.addCardToHand2(deck);
            case "Computer3":
                hand.addCardToHand3(deck);
            case "Real Player":
                hand.addCardToHand4(deck);
        }

    }

    /**
     * After taking the bids, first player starts the round and every player plays a card according to the proper suit(if they have).
     */
    public void playARound(){
        for(int i =0; i<13;i++){
            if(i==0){
                realPlayer.firstPlayerPlays(realPlayer.getHand(),cardsPlayed);
            }
            else{
                realPlayer.playACard(realPlayer.getHand(),cardsPlayed);
            }
            computer1.playACard(computer1.getHand(),cardsPlayed);
            computer2.playACard(computer2.getHand(),cardsPlayed);
            computer3.playACard(computer3.getHand(),cardsPlayed);
            determineRoundWinner();
        }
        arrangeScore(realPlayer);
        arrangeScore(computer1);
        arrangeScore(computer2);
        arrangeScore(computer3);
    }

    /**
     * After every player plays a card, this method determines the biggest value in the ground(cardsPlayed) with biggest suit.
     * @return winner player of the round
     */
    public Player determineRoundWinner(){
        Card winnerCard = cardsPlayed.getHead();
        int count=0;
        if(winnerCard.getCardSuit().equals(winnerCard.getNextCard().getCardSuit())){
            for(int i =0; i<3; i++){
                if(winnerCard.getCardValue()<winnerCard.getNextCard().getCardValue()){
                    winnerCard=winnerCard.getNextCard();
                    count++;
                }
            }
        }
        else{
            for(int i =0; i<3; i++){
                if(winnerCard.getCardSuit().equals("Spades")){
                }else{
                    count++;
                }
            }
        }
        switch (count){
            case 0:
                realPlayer.setRoundWon(realPlayer.getRoundWon()+1);
                return realPlayer;
            case 1:
                computer1.setRoundWon(computer1.getRoundWon()+1);
                return computer1;
            case 2:
                computer2.setRoundWon(computer2.getRoundWon()+1);
                return computer2;
            case 3:
                computer3.setRoundWon(computer3.getRoundWon()+1);
                return computer3;
        }
        System.out.println("Round winner is " + this);
        return null;
    }

    /**
     * This method adds points to the winner player of the round according to the given rules.
     */
    public void arrangeScore(Player p){
        if(p.getBid()>p.getRoundWon()){
            p.setScore(p.getScore()-(p.getBid()*10));
        } else if (p.getBid() == p.getRoundWon()){
            p.setScore(p.getScore()+(p.getBid()*10));
        } else if (p.getBid() < p.getRoundWon()){
            int a = p.getRoundWon()-p.getBid();
            p.setScore(p.getScore()+(p.getBid()*10)+a);
        }
    }

    /**
     * This method will finish the game if one of the players have been reached 500 points.
     */
    public Player endGame(){
            if(realPlayer.getScore()>computer1.getScore() && realPlayer.getScore()>computer2.getScore() && realPlayer.getScore()>computer3.getScore()){
                return realPlayer;
            }
            if(computer1.getScore()>realPlayer.getScore() && computer1.getScore()>computer2.getScore() && computer1.getScore()>computer3.getScore()){
                return computer1;
            }
            if(computer2.getScore()>realPlayer.getScore() && computer2.getScore()>computer1.getScore() && computer2.getScore()>computer3.getScore()){
                return computer1;
            }
            if(computer3.getScore()>realPlayer.getScore() && computer3.getScore()>computer2.getScore() && computer3.getScore()>computer1.getScore()){
                return computer1;
            }
            return null;
    }
}
