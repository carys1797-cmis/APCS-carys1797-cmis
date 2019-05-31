import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import javax.swing.JOptionPane;
public class Game extends Actor
{
    private Letters bagofLets;
    private List<Player> players;

    public Game(){
        this.bagofLets = new Letters();
        this.players = new ArrayList<Player>(2);
    }

    public void addPlayers(String p1, String p2){
        Player player1 = new Player(p1);
        players.add(player1);
        Player player2 = new Player(p2);
        players.add(player2);
    }

    public void setup(String p1, String p2){
        addPlayers(p1, p2);
        for(Player p : players){
            p.getRack().fillRack(bagofLets);
        }
    }

    public void act() 
    {
        //while(bagofLets.number() > 0){
        for(Player p : players){
            //Greenfoot.setWorld(new Playerpage(p.getName()));
            System.out.println(p.getRack());
            String word = JOptionPane.showInputDialog(p.getName() + " Word: ");
            if(word == "swap"){
                p.getRack().swapLets(bagofLets);
            }else {
                if(!p.checkWord(word)){
                }else{
                    p.positionWord();
                    p.playWord(word);
                }
            }
        }
        //}
    }    
}
