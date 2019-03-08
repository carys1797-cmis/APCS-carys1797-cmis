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
        if(card.getrank() == 0){
            return score += 11;
        }else if(card.getrank() < 10){
            score += card.getrank() + 1;
        }else{
            return score += 10;
        }
        return score;
    }

    public String toString(){
        String out = "";
        for(Card card : cards){
            out += card.toString() + " ";
        }
        return out;
    }
}