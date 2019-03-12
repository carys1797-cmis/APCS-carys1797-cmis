import java.util.*;
public class Deck
{
    private List<Card> cards;

    public Deck(int nDecks){
        cards = new ArrayList<Card>();
        while(nDecks > 0){
            for(int rank = 0; rank < 13; rank++){
                for(int suit = 0; suit < 4; suit++){
                    cards.add(new Card(rank, suit));
                }
            }
            nDecks--;
        }
    }

    public int nCards(){
        return cards.size();
    }

    public Card draw(){
        int last = cards.size() - 1;
        return cards.remove(last);
    }

    public void shuffle(){
        for(int i = 0; i < 100; i++){
            int index = (int) (Math.random() * cards.size());
            Card moving = cards.get(index);
            cards.remove(index);
            cards.add(moving);
        }
    }
    
    public void main(String args[]){
        System.out.println(draw());
    }

    //public void shuffle(){
    //cards.set(card, index);
    //cards.get(index);
    //}
}
