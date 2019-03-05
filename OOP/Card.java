
public class Card
{
    private String rank;
    private String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String suit;
    private String[] suits = {"♣", "♠", "♦", "♥"};
    
    public Card(){
        this.rank = "";
        this.suit = "";
    }

    public Card(int r, int s){
        this.rank = ranks[r];
        this.suit = suits[s];
    }
    
    public String getrank(){
        return rank;
    }
    
    public String toString(){
        return rank + suit;
    }
}
