import java.util.*;

public class BlackJack
{
    public static Deck deck = new Deck(5);

    public static Hand hand(){
        Hand hand = new Hand();
        for(int i = 0; i < 2; i++){ 
            hand.addCard(deck.draw());
        }

        while(hand.getScore() < 21){
            Scanner reader = new Scanner(System.in);
            System.out.println("Press 1 to Draw  or  Press 0 to Keep");
            int act = reader.nextInt();
            if(act == 1){
                hand.addCard(deck.draw());
            }else{
                return hand;
            }
        }
        return hand;
    }

    public static ArrayList<Hand> playerHands(int nPlayers){
        ArrayList<Hand> playerHands = new ArrayList<Hand>();
        for(int i = 0; i < nPlayers + 1; i++){
            Hand newHand = hand();
            playerHands.add(newHand);
        }
        return playerHands;
    }

    public static String win(int player, int dScore, int pScore){
        if (pScore > dScore){
            return "Player " + player + " won";
        }else if(pScore > 21){
            return "Player " + player + "Bust! Dealer won";
        }else if(dScore > 21){
            return "Dealer Bust! Player " + player + " won";
        }else{
            return "Dealer won";
        }
    }

    public static void print(Deck deck){
        while(deck.nCards() > 0){
            System.out.println(deck.draw());
        }
    }

    public static void main(String args[]){
        deck.shuffle();
        ArrayList<Hand> playerHands = playerHands(1);
        Hand dealerHand = playerHands.get(0);
        int dealerScore = dealerHand.getScore();
        System.out.println("Dealer\nHand: " + dealerHand + "\nScore: " + dealerScore + "\n");
        System.out.println("Player 1\nHand: " + playerHands.get(1) + "\nScore: " + playerHands.get(1).getScore() + "\n" + win(1, dealerScore, playerHands.get(1).getScore()));
    }
}
 