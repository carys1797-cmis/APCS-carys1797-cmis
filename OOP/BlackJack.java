
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
    
    public static String win(String name, int d, int p){
        if (p > d){
            return name + " won";
        }else {
            return "Dealer won";
        }
    }
    
    public static void print(Card[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "  ");
        }
    }
    
    public static void main(String args[]){
        Card[] dealerhand = hand();
        int dealerscore = score(dealerhand[0].getrank()) + score(dealerhand[1].getrank());
        Card[] p1hand = hand();
        int p1score = score(p1hand[0].getrank()) + score(p1hand[1].getrank());
        String p1w = win("Player 1", dealerscore, p1score);
        Card[] p2hand = hand();
        int p2score = score(p2hand[0].getrank()) + score(p2hand[1].getrank());
        String p2w = win("Player 2", dealerscore, p2score);
        Card[] p3hand = hand();
        int p3score = score(p3hand[0].getrank()) + score(p3hand[1].getrank());
        String p3w = win("Player 3", dealerscore, p3score);
        Card[] p4hand = hand();
        int p4score = score(p4hand[0].getrank()) + score(p4hand[1].getrank());
        String p4w = win("Player 4", dealerscore, p4score);
        Card[] p5hand = hand();
        int p5score = score(p5hand[0].getrank()) + score(p5hand[1].getrank());
        String p5w = win("Player 5", dealerscore, p5score);
        System.out.print("Dealer\nHand: ");
        print(dealerhand);
        System.out.println("\nScore: " + dealerscore + "\n");
        System.out.print("Player 1\nHand: ");
        print(p1hand);
        System.out.println("\nScore: " + p1score + "\n" + p1w + "\n");
        System.out.print("Player 2\nHand: ");
        print(p2hand);
        System.out.println("\nScore: " + p2score + "\n" + p2w + "\n");
        System.out.print("Player 3\nHand: ");
        print(p3hand);
        System.out.println("\nScore: " + p3score + "\n" + p3w + "\n");
        System.out.print("Player 4\nHand: ");
        print(p4hand);
        System.out.println("\nScore: " + p4score + "\n" + p4w + "\n");
        System.out.print("Player 5\nHand: ");
        print(p5hand);
        System.out.println("\nScore: " + p5score + "\n" + p5w + "\n");
    }
}
