
public class Card
{
    private int rank; 
    private int suit;
    private boolean faceUp;
    
    
    public Card(){
        rank = (int)(Math.random() * 13);
        suit = (int)(Math.random() * 4);
    }
    
    public Card(int r, int s){
        rank = r;
        suit = s;
    }
    
    public int getrank(){
        return rank;
    }
    
    public String toString(){
        String[] suits = {"♣", "♠", "♦", "♥"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        return String.format("%s%s", ranks[rank], suits[suit]);
    }
}
