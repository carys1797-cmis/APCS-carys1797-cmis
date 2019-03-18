import java.util.*;
public class Game
{
    private Deck deck;
    private List<Player> players;
    private Player dealer;  

    public Game(){
        this.deck = new Deck(5);
        this.players = new ArrayList<Player>(1);
        this.dealer = new Player("Dealer");
    }

    public void addPlayers(int n){
        players.add(dealer);
        for(int i = 1; i <= n; i++){
            Scanner reader = new Scanner(System.in);
            System.out.println("Name: ");
            String name = reader.nextLine();
            Player newPlayer = new Player(name);
            players.add(newPlayer);
        }
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

    public void playRound(){
        for(Player player : players){
            if (player == dealer){
                while(dealer.getHand().getScore() <= 16){
                    dealer.getHand().addCard(deck.draw());
                }
            }else{
                int act = 1;
                do {
                    Scanner reader = new Scanner(System.in);
                    System.out.println("Press 1 to Draw  or  Press 0 to Keep");
                    act = reader.nextInt();
                    if(act == 1){
                        player.getHand().addCard(deck.draw());
                    }
                }while(act != 0);
            }
        }

    }

    public void results(){
        for(Player player : players){
            if (player.getHand().nCards() == 2 && player.getHand().getScore() == 21){
                player.setResult(true);
            }else if (player.getHand().getScore() > 21){
                player.setResult(false);
            }else if(player.getHand().getScore() > dealer.getHand().getScore()){
                player.setResult(true);
            }else if(dealer.getHand().getScore() > 21){
                player.setResult(true);
            }else{
                player.setResult(false);
            }
        }
    }

    public String toString(){
        String out = "";
        for(Player player : players){
            out += player.toString() + " \n\n";
        }
        return out;
    }

}

//setup, add player, play round, summary,

//win --> player gets Blackjack (21 with 2 cards);
//lose --> bust (cards add up to over 21);
//win --> player <= 21 and player > dealer;
//lose --> dealer has blackjack and player doesn't
