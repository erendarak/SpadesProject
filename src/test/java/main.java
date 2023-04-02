public class main {

    public static void main(String args[]){

        Deck d1 = new Deck(null,null,0);
        d1.addCardtoDeck();
        System.out.println(d1.toString());
        System.out.println(d1.getHead().getNextCard().getNextCard());
    }
}
