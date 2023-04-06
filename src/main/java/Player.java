import java.util.Scanner;

public class Player {

    private final String identity;  //Identity of the player (computer or real player)
    private Hand hand;  //Hand of the player
    private int score=0; //Score of the player(initially 0)
    private int bid;  //Bid of the player
    private int roundWon=0; //Rounds that a player won



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
     * This method allows the real player to play the first card of the game.
     * @param hand  real players hand
     * @param cardsPlayed   ground
     */
    public void firstPlayerPlays(Hand hand, CardsPlayed cardsPlayed){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the index of the card in your hand to play it(0 to 12): ");
        int index = scanner.nextInt();
        Card k1= hand.getHead();
        Card k = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
        int counter=0;
        for(int i = 0; i< index; i++){
            k=k.getNextCard();
            k1=k1.getNextCard();
            counter++;
        }
        cardsPlayed.addCardToGround(hand,counter);
        System.out.println(identity + " played:\n" + k1.toString());
        hand.deleteMiddleHand(k1);
    }

    /**
     * Plays a card in its hand with the getACard method in hand class.
     * @param hand from specified hand
     * @param cardsPlayed from specified table
     */
    public void playACard(Hand hand, CardsPlayed cardsPlayed){
        if(identity=="Computer1" || identity=="Computer2" || identity=="Computer3"){
            String suitATM = cardsPlayed.getSuitATM();
            switch (suitATM){
                case "Hearts":
                    int xCount=0;
                    Card x1= hand.getHead();
                    Card x = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
                    for(int i=0; i<13; i++){
                        if (x1.getCardSuit().equals(suitATM)){
                            cardsPlayed.addCardToGround(hand,i);
                            System.out.println(identity + " played:\n" + x1.toString());
                            hand.deleteMiddleHand(x1);
                            break;
                        }
                        x=x.getNextCard();
                        x1=x1.getNextCard();
                    }
                    if(xCount==12){
                        Card x3= hand.getHead();
                        Card x2 = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
                        for(int i=0; i<13; i++){
                            if (x3.getCardSuit().equals("Spades")){
                                cardsPlayed.addCardToGround(hand,i);
                                System.out.println(identity + " played:\n" + x3.toString());
                                hand.deleteMiddleHand(x3);
                                break;
                            }
                            x2=x2.getNextCard();
                            x3=x3.getNextCard();
                        }
                    }
                case "Clubs":
                    int yCount=0;
                    Card y1= hand.getHead();
                    Card y = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
                    for(int i=0; i<13; i++){
                        if (y1.getCardSuit().equals(suitATM)){
                            cardsPlayed.addCardToGround(hand,i);
                            System.out.println(identity + " played:\n" + y1.toString());
                            hand.deleteMiddleHand(y1);
                            break;
                        }
                        y=y.getNextCard();
                        y1=y1.getNextCard();
                    }
                    if(yCount==12){
                        Card y3= hand.getHead();
                        Card y2 = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
                        for(int i=0; i<13; i++){
                            if (y3.getCardSuit().equals("Spades")){
                                cardsPlayed.addCardToGround(hand,i);
                                System.out.println(identity + " played:\n" + y3.toString());
                                hand.deleteMiddleHand(y3);
                                break;
                            }
                            y2=y2.getNextCard();
                            y3=y3.getNextCard();
                        }
                    }
                case "Spades":
                    int zCount=0;
                    Card z1= hand.getHead();
                    Card z = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
                    for(int i=0; i<13; i++){
                        if (z1.getCardSuit().equals(suitATM)){
                            cardsPlayed.addCardToGround(hand,i);
                            System.out.println(identity + " played:\n" + z1.toString());
                            hand.deleteMiddleHand(z1);
                            break;
                        }
                        z=z.getNextCard();
                        z1=z1.getNextCard();
                        zCount++;
                    }
                    if(zCount==12){
                        Card z3= hand.getHead();
                        Card z2 = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
                        for(int i=0; i<13; i++){
                            if (z3.getCardSuit().equals("Spades")){
                                cardsPlayed.addCardToGround(hand,i);
                                System.out.println(identity + " played:\n" + z3.toString());
                                hand.deleteMiddleHand(z3);
                                break;
                            }
                            z2=z2.getNextCard();
                            z3=z3.getNextCard();
                        }
                    }
                case "Diamonds":
                    int tCount=0;
                    Card t1= hand.getHead();
                    Card t = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
                    for(int i=0; i<13; i++){
                        if (t1.getCardSuit().equals(suitATM)){
                            cardsPlayed.addCardToGround(hand,i);
                            System.out.println(identity + " played:\n" + t1.toString());
                            hand.deleteMiddleHand(t1);
                            break;
                        }
                        t=t.getNextCard();
                        t1=t1.getNextCard();
                    }
                    if(tCount==12){
                        Card t3= hand.getHead();
                        Card t2 = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
                        for(int i=0; i<13; i++){
                            if (t3.getCardSuit().equals("Spades")){
                                cardsPlayed.addCardToGround(hand,i);
                                System.out.println(identity + " played:\n" + t3.toString());
                                hand.deleteMiddleHand(t3);
                                break;
                            }
                            t2=t2.getNextCard();
                            t3=t3.getNextCard();
                        }
                    }
            }
        }
        else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please write the index of the card in your hand to play it(0 to 12): ");
            int index = scanner.nextInt();
            Card k1= hand.getHead();
            Card k = new Card(hand.getHead().getCardName(),hand.getHead().getCardValue(),hand.getHead().getCardSuit(),hand.getHead().getNextCard());
            for(int i = 0; i< index; i++){
                if (k1.getCardSuit().equals(cardsPlayed.getSuitATM())){
                    cardsPlayed.addCardToGround(hand,i);
                    System.out.println(identity + " played:\n" + k1.toString());
                    hand.deleteMiddleHand(k1);
                    break;
                }
                k=k.getNextCard();
                k1=k1.getNextCard();
            }
        }
    }

    /**
     * Displays the hand of the player.
     */
    public void showHand(){
        System.out.println(identity);
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

    /**
     * Gets the rounds that player won.
     * @return roundWon
     */
    public int getRoundWon() {
        return roundWon;
    }

    /**
     * Edits the rounds that player won.
     * @return roundWon
     */
    public void setRoundWon(int roundWon) {
        this.roundWon = roundWon;
    }
}
