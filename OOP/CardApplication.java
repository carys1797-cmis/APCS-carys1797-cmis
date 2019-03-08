import java.util.*;
public class CardApplication
{
    
    
    public static void print(Card[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
    public static void main(String args[]){
        Deck deck = new Deck(3);
        int deckSize = deck.nCards();
        System.out.println(deckSize);
        for (int i = 0; i < deckSize; i++){
            System.out.println(deck.draw());
        }
        
    }
}
