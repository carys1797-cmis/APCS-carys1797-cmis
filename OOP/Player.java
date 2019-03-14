import java.util.*;
public class Player
{
   private String name;
   private Hand hand;
   private int chips;
   
   public Player(String nm, int c){
       this.name = nm;
       this.hand = new Hand();
       this.chips = 1000;
   }
   
   public Hand getHand(){
       return hand;
   }
   
   //dealer
   
   public void draw(Deck deck){
       hand.addCard(deck.draw());
   }
   
   public void bet(){
       
   }
}
