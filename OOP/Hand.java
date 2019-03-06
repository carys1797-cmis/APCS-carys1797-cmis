import java.util.*;
public class Hand
{
    private List<Card> cards;
    
    public Hand(){
        cards = new ArrayList<Card>();
    }
    
    public void addCard(Card card){
        cards.add(card);
    }
    
    public int getValue(Card card){
        int score = 0;
        if(card.getrank() == "1"){
            return score += 1;
        }else if(card.getrank() == "2"){
            return score += 2;
        }else if(card.getrank() == "3"){
            return score += 3;
        }else if(card.getrank() == "4"){
            return score += 4;
        }else if(card.getrank() == "5"){
            return score += 5;
        }else if(card.getrank() == "6"){
            return score += 6;
        }else if(card.getrank() == "7"){
            return score += 7;
        }else if(card.getrank() == "8"){
            return score += 8;
        }else if(card.getrank() == "9"){
            return score += 9;
        }else if(card.getrank() == "10"|| card.getrank() == "J" || card.getrank() == "Q" || card.getrank() == "K"){
            return score += 10;
        }else{
            return score += 11;
        }
    }
    
    public String toString(){
        String out = "";
        for(Card card : cards){
            out += card.toString() + " ";
        }
        return out;
    }
}