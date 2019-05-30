import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
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
    
    public void setup(){
        for(Player p : players){
            player.getRack().fillRack();
        }
    }
    
    public void act(String p1, String p2) 
    {
        addPlayers(p1, p2);
        setup();
    }    
}
