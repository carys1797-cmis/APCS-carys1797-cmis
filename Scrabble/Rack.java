import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Rack extends Actor
{
    private List<String> rack;
    
    public Rack(){
        this.rack = new ArrayList<String>(7);
    }
    
    public void addLet(String let){
        rack.add(let);
    }
    
    public void playLet(String let){
        rack.remove(let);
    }
    
    public void swapLets(Letters bL){
        for(int i = 0; i < 7; i++){
            bL.putBack(rack.remove(i));
        }
    }
    
    public void fillRack(Letters bL){
        int r = 7 - rack.size();
        for(int i = 0; i < r; i++){
            rack.add(bL.pick());
        }
    }
    
    public void act() 
    {
        
    }    
}
