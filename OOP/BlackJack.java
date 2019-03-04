
public class BlackJack
{
    public static Card[] hand(){
        Card[] hand = new Card[2];

        for(int i = 0; i < 2; i++){
            int r = (int) (Math.random() * 13);
            int s = (int) (Math.random() * 4);
            Card randomCard = new Card(r, s);
            hand[i] = randomCard;
        }
        return hand;
    }

    public static int score(String rank){
        int score = 0;
        if(rank == "1"){
            return score += 1;
        }else if(rank == "2"){
            return score += 2;
        }else if(rank == "3"){
            return score += 3;
        }else if(rank == "4"){
            return score += 4;
        }else if(rank == "5"){
            return score += 5;
        }else if(rank == "6"){
            return score += 6;
        }else if(rank == "7"){
            return score += 7;
        }else if(rank == "8"){
            return score += 8;
        }else if(rank == "9"){
            return score += 9;
        }else if(rank == "10"|| rank == "J" || rank == "Q" || rank == "K"){
            return score += 10;
        }else{
            return score += 11;
        }

    }
    
    public static boolean win(int d, int p){
        if (p > d){
            return true;
        }else {
            return false;
        }
    }
    
    public static void main(String args[]){
        Card[] dealerhand = hand();
        int dealerScore = score(dealerhand[0].getrank()) + score(dealerhand[1].getrank());
        //boolean dw = win(
        Card[] p1hand = hand();
        int p1score = score(p1hand[0].getrank()) + score(p1hand[1].getrank());
        boolean p1w = win(dealerScore, p1score);
        Card[] p2hand = hand();
        int p2score = score(p2hand[0].getrank()) + score(p2hand[1].getrank());
        
        Card[] p3hand = hand();
        int p3score = score(p3hand[0].getrank()) + score(p3hand[1].getrank());
        
        Card[] p4hand = hand();
        int p4score = score(p4hand[0].getrank()) + score(p4hand[1].getrank());
        Card[] p5hand = hand();
        int p5score = score(p5hand[0].getrank()) + score(p5hand[1].getrank());
        
    }
}
