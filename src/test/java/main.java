import java.util.Scanner;

public class main {

    public static void main(String args[]){


            Deck d1 = new Deck(null,null,0);
            d1.addCardtoDeck();
            d1.shuffle();


            Hand h1 = new Hand(null,null,0,13);
            h1.addCardToHand1(d1);
            Hand h2 = new Hand(null,null,0,13);
            h2.addCardToHand2(d1);
            Hand h3 = new Hand(null,null,0,13);
            h3.addCardToHand3(d1);
            Hand h4 = new Hand(null,null,0,13);
            h4.addCardToHand4(d1);


            CardsPlayed cardsPlayed = new CardsPlayed(null,null);


            int c1Bid =d1.createBidForBots();
            int c2Bid =d1.createBidForBots();
            int c3Bid =d1.createBidForBots();


            Player c1 = new Player("Computer1",h1,0,c1Bid);
            Player c2 = new Player("Computer2",h2,0,c2Bid);
            Player c3 = new Player("Computer3",h3,0,c3Bid);
            Player r = new Player("Real Player",h4,0,0);

            r.showHand();

            Scanner scanner = new Scanner(System.in);
            System.out.print("What is your bid: ");
            int rBid = scanner.nextInt();
            r.setBid(rBid);

            Gameplay gameplay = new Gameplay(c1,c2,c3,r,d1,cardsPlayed);

            c1.showHand();
            c2.showHand();
            c3.showHand();

            boolean dontEndGame = r.getScore() <500 || c1.getScore() <500 || c2.getScore() <500 || c3.getScore() <500;
            while(dontEndGame){
                if(dontEndGame){
                    System.out.println("===================================================");
                    r.showHand();
                    System.out.println("===================================================");
                    gameplay.playARound();
                }
                else{
                    System.out.println("The game has ended. The winner is " + gameplay.endGame());
                }
        }
    }
}
