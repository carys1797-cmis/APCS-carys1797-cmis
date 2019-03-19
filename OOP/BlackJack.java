import java.util.*;

public class BlackJack
{
    public static void main(String args[]){
        Game blackjack = new Game();
        blackjack.addPlayers(1);
        blackjack.setup();
        blackjack.playRound();
        blackjack.win();
        System.out.println(blackjack);
    }
}
 