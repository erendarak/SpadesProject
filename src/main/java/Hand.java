public class Hand {

    private Card head;   //First element of the hand list.
    private Card tail;  //Last element of the hand list.
    private int numberOfCardsATM;  //Number of cards at that time
    private int numberOfCardsN;  //Number of cards normally 13

    /**
     * Constructs the hand class for specified properties to have 13 cards for everyone.
     * @param head head
     * @param tail  tail
     * @param numberOfCardsATM numberOfCardsATM
     * @param numberOfCardsN numberOfCardsN
     */
    public Hand(Card head, Card tail, int numberOfCardsATM, int numberOfCardsN) {
        this.head = head;
        this.tail = tail;
        this.numberOfCardsATM = numberOfCardsATM;
        this.numberOfCardsN = numberOfCardsN;
    }

    /**
     * Adds card to the hand with the getFirstCardOfDeck method of the given deck.
     * @param deck given deck
     */
    public void addCardToHand1(Deck deck) {
            Card current=deck.getHead();
            for(int i =0; i<13; i++){
                Card c1 = new Card(current.getCardName(), current.getCardValue(), current.getCardSuit(), current.getNextCard());
                insertFirstHand(c1);
                current=current.getNextCard();
                numberOfCardsATM++;
            }
    }

    /**
     * Adds card to the hand with the getFirstCardOfDeck method of the given deck.
     * @param deck given deck
     */
    public void addCardToHand2(Deck deck) {
        Card current=deck.getHead();
        for(int k=0; k<13; k++){
            current=current.getNextCard();
        }
        for(int i =13; i<26; i++){
            Card c1 = new Card(current.getCardName(), current.getCardValue(), current.getCardSuit(), current.getNextCard());
            insertFirstHand(c1);
            current=current.getNextCard();
            numberOfCardsATM++;
        }
    }

    /**
     * Adds card to the hand with the getFirstCardOfDeck method of the given deck.
     * @param deck given deck
     */
    public void addCardToHand3(Deck deck) {
        Card current=deck.getHead();
        for(int k=0; k<26; k++){
            current=current.getNextCard();
        }
        for(int i =26; i<39; i++){
            Card c1 = new Card(current.getCardName(), current.getCardValue(), current.getCardSuit(), current.getNextCard());
            insertFirstHand(c1);
            current=current.getNextCard();
            numberOfCardsATM++;
        }
    }

    /**
     * Adds card to the hand with the getFirstCardOfDeck method of the given deck.
     * @param deck given deck
     */
    public void addCardToHand4(Deck deck) {
        Card current=deck.getHead();
        for(int k=0; k<39; k++){
            current=current.getNextCard();
        }
        for(int i =39; i<52; i++){
            Card c1 = new Card(current.getCardName(), current.getCardValue(), current.getCardSuit(), current.getNextCard());
            insertFirstHand(c1);
            current=current.getNextCard();
            numberOfCardsATM++;
        }
    }

    /**
     * This method adds the given card to the hand as a first element.
     * @param newCard given card
     */
    public void insertFirstHand(Card newCard){
        if (tail == null){
            tail=newCard;
        }
        newCard.setNextCard(head);
        head = newCard;
    }

    /**
     * Deletes card from the hand
     * @param no index of linked list
     */
    public void deleteCard(int no){
        if(head.getNextCard()==null){
            deleteFirstHand();
        }
        else{
            Card deleted = head;
            for(int i=1; i<no; i++){
                deleted=deleted.getNextCard();
            }
            deleteMiddleHand(deleted);
        }
    }

    /**
     * Deletes the given card from the specific place.
     * @param c given card
     */
    public void deleteMiddleHand(Card c){
        Card previous = getPreviousHand(c);
        if(previous==null){
            deleteFirstHand();
        }else{
            if(c.getNextCard()==null){
                deleteLastHand();
            }
            else{
                previous.setNextCard(c.getNextCard());
            }
        }
    }

    /**
     * Returns to the previous card of the given card.
     * @param c given card
     * @return  previous card
     */
    public Card getPreviousHand(Card c){
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
     * Deletes the last card of the deck.
     */
    public void deleteLastHand(){
        tail = getPreviousHand(tail);
        if(tail != null){
            tail.setNextCard(null);
        } else {
            head = null;
        }
    }

    /**
     * Deletes the first card of the deck.
     */
    public void deleteFirstHand(){
        if(head == null){
            tail = null;
        }
        else{
            head=head.getNextCard();
        }
    }


    /**
     * Gets the first element of the hand(card).
     * @return head
     */
    public Card getHead() {
        return head;
    }

    /**
     * Edits the first element of the hand(card).
     * @param head
     */
    public void setHead(Card head) {
        this.head=head;
    }

    /**
     * Gets the last element of the hand(card).
     * @return tail
     */
    public Card getTail() {
        return tail;
    }

    /**
     * Edits the last element of the hand(card).
     * @param tail
     */
    public void setTail(Card tail) {
        this.tail=tail;
    }

    /**
     * Gets the number of the cards at that moment
     * @return number of the cards at that moment
     */
    public int getNumberOfCardsATM(){
        return numberOfCardsATM;
    }


    /**
     * Searches for a card which is requested at that index.
     * @param no given index
     * @return  wanted card
     */
    public Card searchCard(int no){
        Card searched = head;
        if(head.getNextCard()!=null){
            for(int i=0; i<no; i++){
                searched=searched.getNextCard();
            }
        }
        return searched;
    }

    /**
     * Prints the properties of the hand.
     * @return cards in the hand
     */
    @Override
    public String toString() {
        String toString = "Cards in the hand:\n";
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
