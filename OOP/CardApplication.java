
public class CardApplication
{
    public static Card[] deck(){
        Card[] deck = new Card[52];
        int r = 0, s = 0;
        for(int i = 0; i < 52; i++){
            Card c = new Card(r, s);
            deck[i] = c;
            r++;
            if(r == 13){
                s++;
                r = 0;
            }
        }
        return deck;
    }
    
    public static void print(Card[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    
    public static void main(String args[]){
        Card[] myHand = new Card[3];
        for(int i = 0; i < 3; i++){
            int r = (int) (Math.random() * 13);
            int s = (int) (Math.random() * 4);
            Card randomCard = new Card(r, s);
            myHand[i] = randomCard;
        }
        //System.out.println(myHand[0]);
        //System.out.println(myHand[1]);
        //System.out.println(myHand[2]);
        Card[] deck = deck();
        print(deck);
    }
}
