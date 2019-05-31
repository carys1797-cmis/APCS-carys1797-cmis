import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Player extends Actor
{
    private String name;
    private Rack rack;
    private int handicap;
    
    public Player(){
        this.name = "";
        this.rack = new Rack();
    }
    
    public Player(String n){
        this.name = n;
        this.rack = new Rack();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public Rack getRack(){
        return rack;
    }
    
    public boolean checkWord(String word){
        Rack temp = rack;
        for(int i = 0; i < word.length(); i++){
            if(temp.findLet(word.charAt(i)) == -1){
                return false;
            }
            temp.playLet((String.valueOf(word.charAt(i))));
        }
        return true;
    }
    
    public String playWord(String word){
        for(int i = 0; i < word.length(); i++){
            int index;
            if(rack.findLet(word.charAt(i)) != -1){
                rack.playLet(String.valueOf(word.charAt(i)));
            }
        }
        return word;
    }
    
    public void positionWord(){
        
    }
    
    public void act() 
    {
        
    }    
}
