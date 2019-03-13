import java.util.*;
public class Game
{
    private Hand dealer;
    private ArrayList<Hand> players;
    private Deck deck;
    
    public Game(int nPlayers){
        this.deck = new Deck(5);
        this.dealer = hand();
        for(int i = 0; i <= nPlayers; i++){
            Hand newHand = hand();
            this.players.add(newHand);
        }
    }

    public Hand hand(){
        Hand hand = new Hand();
        for(int i = 0; i < 2; i++){ 
            hand.addCard(deck.draw());
        }
        return hand;
    }
    
    public void turn(int player){
        while(players.get(player).getScore() < 21){
            Scanner reader = new Scanner(System.in);
            System.out.println("Press 1 to Draw  or  Press 0 to Keep");
            int act = reader.nextInt();
            if(act == 1){
                players.get(player).addCard(deck.draw());
            }else{
                break;
            }
        }
    }
    
    public String win(int player){
        if (players.get(player).getScore() > dealer.getScore()){
            return "Player " + player + " won";
        }else if(players.get(player).getScore() > 21){
            return "Player " + player + "Bust! Dealer won";
        }else if(dealer.getScore() > 21){
            return "Dealer Bust! Player " + player + " won";
        }else{
            return "Dealer won";
        }
    }
}
