import java.util.*;
public class Player
{
   private String name;
   private Hand hand;
   private int chips;
   private boolean result;
   
   public Player(String nm){
       this.name = nm;
       this.hand = new Hand();
       this.chips = 1000;
       this.result = false;
   }
   
   public Hand getHand(){
       return hand;
   }
   
   public void setResult(boolean r){
       result = r;
   }
   
   public void draw(Deck deck){
       hand.addCard(deck.draw());
   }
   
   public void bet(){
       
   }
   
   public String toString(){
       return name + "\nHand: " + hand + "\nScore: " + hand.getScore() + "\nBet: " + "\nResults: " + result;
    }
}
