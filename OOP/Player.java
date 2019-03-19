import java.util.*;
public class Player
{
    private String name;
    private Hand hand;
    private int bet;
    private int chips;
    private boolean win;
    private String result;

    public Player(String nm){
        this.name = nm;
        this.hand = new Hand();
        this.chips = 1000;
        this.win = false;
        this.result = "";
    }
    
    public String getName(){
        return name;
    }
    
    public Hand getHand(){
        return hand;
    }

    public void draw(Deck deck){
        hand.addCard(deck.draw());
    }

    public void bet(){
        this.bet = 10;
        if(win){
            chips += 10;
        }else{
            chips -= 10;
        }
    }

    public void setWin(boolean w){
        win = w;
    }

    public void setResults(String r){
        result = r;
    }

    public String toString(){
        if(name == "Dealer"){
            return name + "\nHand: " + hand + "\nScore: " + hand.getScore() + "\nBet: ";
        }
        return name + "\nHand: " + hand + "\nScore: " + hand.getScore() + "\nBet: " + bet + "\nResults: " + result + "\nChips: " + chips;
    }
}
