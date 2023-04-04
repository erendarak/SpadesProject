import java.util.Random;

public class Deck {

    private Card head;   //First element of the deck list.
    private Card tail;  //Last element of the deck list.
    private int numberOfCards;  //Number of the cards in the deck at that time. Its normally 52.

    /**
     * Constructs the deck (linked list).
     * @param head head
     * @param tail  tail
     * @param numberOfCards numberOfCards
     */
    public Deck(Card head, Card tail, int numberOfCards) {
        this.head=head;
        this.tail=tail;
        this.numberOfCards=numberOfCards;
    }

    /**
     * This method creates the deck with a nested for loop for all suits and values.
     * @param name given name
     * @param value given value
     * @param suit  given suit
     * @param next  given following card
     */
    public void createCards(String name, int value, String suit, Card next){
        Card cardNew = new Card(name, value, suit, next);
        if (head==null) {
            this.head = cardNew;
            this.tail = cardNew;
        } else {
            this.tail.setNextCard(cardNew);
            this.tail = cardNew;
        }
        this.numberOfCards=52;
    }

    /**
     * This method adds the created cards to the deck.
     */
    public void addCardtoDeck(){
            this.createCards("2",2,"Hearts",
                    new Card("3",3,"Hearts",
                    new Card("4",4,"Hearts",
                    new Card("5",5,"Hearts",
                    new Card("6",6,"Hearts",
                    new Card("7",7,"Hearts",
                    new Card("8",8,"Hearts",
                    new Card("9",9,"Hearts",
                    new Card("10",10,"Hearts",
                    new Card("J",11,"Hearts",
                    new Card("Q",12,"Hearts",
                    new Card("K",13,"Hearts",
                    new Card("A",14,"Hearts",
                    new Card("2",2,"Diamonds",
                    new Card("3",3,"Diamonds",
                    new Card("4",4,"Diamonds",
                    new Card("5",5,"Diamonds",
                    new Card("6",6,"Diamonds",
                    new Card("7",7,"Diamonds",
                    new Card("8",8,"Diamonds",
                    new Card("9",9,"Diamonds",
                    new Card("10",10,"Diamonds",
                    new Card("J",11,"Diamonds",
                    new Card("Q",12,"Diamonds",
                    new Card("K",13,"Diamonds",
                    new Card("A",14,"Diamonds",
                    new Card("2",2,"Spades",
                    new Card("3",3,"Spades",
                    new Card("4",4,"Spades",
                    new Card("5",5,"Spades",
                    new Card("6",6,"Spades",
                    new Card("7",7,"Spades",
                    new Card("8",8,"Spades",
                    new Card("9",9,"Spades",
                    new Card("10",10,"Spades",
                    new Card("J",11,"Spades",
                    new Card("Q",12,"Spades",
                    new Card("K",13,"Spades",
                    new Card("A",14,"Spades",
                    new Card("2",2,"Clubs",
                    new Card("3",3,"Clubs",
                    new Card("4",4,"Clubs",
                    new Card("5",5,"Clubs",
                    new Card("6",6,"Clubs",
                    new Card("7",7,"Clubs",
                    new Card("8",8,"Clubs",
                    new Card("9",9,"Clubs",
                    new Card("10",10,"Clubs",
                    new Card("J",11,"Clubs",
                    new Card("Q",12,"Clubs",
                    new Card("K",13,"Clubs",
                    new Card("A",14,"Clubs",null))))))))))))))))))))))))))))))))))))))))))))))))))));
    }

    Random random = new Random();
    /**
     * This method will shuffle our deck in order to play the game fairly.
     */
    public void shuffle(){
        Card c1;
        Card c2;
        int no;
        for (int i =1; i < numberOfCards-1; i++){
            no= random.nextInt(50)+1;
            while(i==no){
                no= random.nextInt(50)+1;
            }
            c1 = nthCard(i);
            c2 = nthCard(no);

            deleteMiddle(nthCard(i));
            insertMiddle(new Card(c2.getCardName(), c2.getCardValue(), c2.getCardSuit(),c2.getNextCard()), nthCard(no-1));
            deleteMiddle(nthCard(no));
            insertMiddle(new Card(c1.getCardName(), c1.getCardValue(), c1.getCardSuit(),c1.getNextCard()), nthCard(no-1));
        }
    }

    /**
     * Adds a card to the middle of the deck.
     * @param aCard added card
     * @param pCard previous card
     */
    public void insertMiddle(Card aCard, Card pCard){
        aCard.setNextCard(pCard.getNextCard());
        pCard.setNextCard(aCard);
    }

    /**
     * Returns the card which is in that index.
     * @param n given index
     * @return nth Card
     */
    public Card nthCard(int n){
        Card temp = head;
        int index = 0;
        while (temp != null) {
            if (index == n) {
                return temp;
            }
            index++;
            temp = temp.getNextCard();
        }
        return null;
    }

    /**
     * Returns to the previous card of the given card.
     * @param c given card
     * @return  previous card
     */
    public Card getPrevious(Card c){
        if(c==head){
            return head;
        }
        Card temp = head;
        Card previous = null;
        while (temp != null) {
            if(temp.getNextCard()==c){
                previous = temp;
                break;
            }
            temp=temp.getNextCard();
        }
        return previous;
    }

    /**
     * Deletes the given card from the specific place.
     * @param c given card
     */
    public void deleteMiddle(Card c){
        Card previous = getPrevious(c);
        if(previous==null){
            deleteFirst();
        }else{
            if(c.getNextCard()==null){
                deleteLast();
            }
            else{
                previous.setNextCard(c.getNextCard());
            }
        }
    }

    /**
     * Deletes the last card of the deck.
     */
    public void deleteLast(){
        tail = getPrevious(tail);
        if(tail != null){
            tail.setNextCard(null);
        } else {
            head = null;
        }
    }

    /**
     * Deletes the first card of the deck.
     */
    public void deleteFirst(){

        if(head == null){
            tail = null;
        }
        else{
            head=head.getNextCard();
        }
    }

    /**
     * Gets the first card of the deck so that Hand class can add cards to the hands of the players.
     * @return the card(node)
     */
    public Card getFirstCard(){
        return head;
    }

    /**
     * Deletes the first card of the deck.
     */
    public void deleteFirstCard(){
        head = head.getNextCard();
        if(head == null){
            tail = null;
        }
    }

    /**
     * Gets the number of the cards at the deck.
     * @return numberOfCards
     */
    public int getNumberOfCards() {
        return numberOfCards;
    }

    /**
     * Edits the number of the cards at the deck.
     * @param numberOfCards
     */
    public void setNumberOfCards(int numberOfCards) {
        this.numberOfCards=numberOfCards;
    }

    /**
     * Gets the first element of the deck(card).
     * @return head
     */
    public Card getHead() {
        return head;
    }

    /**
     * Edits the first element of the deck(card).
     * @param head
     */
    public void setHead(Card head) {
        this.head=head;
    }

    /**
     * Gets the last element of the deck(card).
     * @return tail
     */
    public Card getTail() {
        return tail;
    }

    /**
     * Edits the first element of the deck(card).
     * @param tail
     */
    public void setTail(Card tail) {
        this.tail=tail;
    }

    /**
     * Prints the deck
     * @return cards of the deck
     */
    @Override
    public String toString() {
        String toString = "Cards in the deck:\n";
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
