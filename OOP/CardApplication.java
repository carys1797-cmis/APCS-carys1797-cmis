
public class CardApplication
{
    public static void main(String args[]){
        Card[] myHand = new Card[3];
        for(int i = 0; i < 3; i++){
            int r = (int) (Math.random() * 13);
            int s = (int) (Math.random() * 4);
            Card randomCard = new Card(r, s);
            myHand[i] = randomCard;
        }
        System.out.println(myHand[0]);
        System.out.println(myHand[1]);
        System.out.println(myHand[2]);
    }
}
