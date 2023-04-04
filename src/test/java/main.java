public class main {

    public static void main(String args[]){

        Deck d1 = new Deck(null,null,0);
        d1.addCardtoDeck();
        System.out.println(d1.getHead());
        System.out.println(d1.toString());
        System.out.println(d1.getHead().getNextCard().getNextCard());

        Hand h1 = new Hand(null,null,0,13);
        h1.addCardToHand(d1);
        System.out.println(h1.toString());
        //System.out.println(d1.toString());
    }
}
