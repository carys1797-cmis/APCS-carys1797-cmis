import java.util.*;
public class Deck
{
    private List<Card> cards;

    public Deck(int nDecks){
        cards = new ArrayList<Card>();
        for(int i = 0; i < nDecks; i++){
            for(int rank = 0; rank < 13; rank++){
                for(int suit = 0; suit < 4; suit++){
                    cards.add(new Card(rank, suit));
                }
            }

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
        //cards.set(object, index);
        //cards.get(index);
    }
}
