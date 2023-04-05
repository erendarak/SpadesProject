public class main {

    public static void main(String args[]){

        Deck d1 = new Deck(null,null,0);
        d1.addCardtoDeck();
        d1.shuffle();
        //System.out.println(d1.getHead());
        System.out.println(d1.toString());
        //System.out.println(d1.getHead().getNextCard().getNextCard());

        Hand h1 = new Hand(null,null,0,13);
        Hand h2 = new Hand(null,null,0,13);
        Hand h3 = new Hand(null,null,0,13);
        Hand h4 = new Hand(null,null,0,13);

        h1.addCardToHand1(d1);
        h2.addCardToHand2(d1);
        h3.addCardToHand3(d1);
        h4.addCardToHand4(d1);

        System.out.println(h1.toString());
        //System.out.println(h2.toString());
        //System.out.println(h3.toString());
        //System.out.println(h4.toString());

        //h1.deleteCard(2);

        //System.out.println(h1.toString());
        //System.out.println(d1.toString());

        CardsPlayed cardsPlayed = new CardsPlayed(null,null);
        cardsPlayed.addCardToGround(h1,3);
        h1.deleteMiddleHand(h1.searchCard(3));
        System.out.println(cardsPlayed.toString());
        System.out.println(h1.toString());
    }
}
