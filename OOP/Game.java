import java.util.*;
public class Game
{
    private Deck deck;
    private List<Player> players;

    public Game(int nPlayers){
        this.deck = new Deck(5);
        this.players = new ArrayList<Player>();
    }

    public void deal(int n){
        for (int i = 0; i < n; i++){
            for(int p = 0; p < players.size(); p++){
                players.get(p).getHand().addCard(deck.draw());
            }
        }
    }

    public void setup(){
        deck.shuffle();
        deal(2);
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

//setup, add player, play round, summary,


//win --> player gets Blackjack (21 with 2 cards);
//lose --> bust (cards add up to over 21);
//win --> player <= 21 and player > dealer;
//lose --> dealer has blackjack and player doesn't
