import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Tile extends Actor
{
    private String letter;
    private int value;
    private List<String> letters = new ArrayList<String>(
            Arrays.asList("E", "E", "E", "E", "E", "E", "E", "E", "E", "E", "E", "E", "A", "A",
                "A", "A", "A", "A", "A", "A", "A", "I", "I", "I", "I", "I", "I", "I", "I", "I",
                "O", "O", "O", "O", "O", "O", "O", "O", "N", "N", "N", "N", "N", "N", "R", "R",
                "R", "R", "R", "R", "T", "T", "T", "T", "T", "T", "L", "L", "L", "L", "S", "S",
                "S", "S", "U", "U", "U", "U",
                "D", "D", "D", "D", "G", "G", "G",
                "B", "B", "C", "C", "M", "M", "P", "P",
                "F", "F", "H", "H", "V", "V", "W", "W", "Y", "Y",
                "K",
                "J", "X",
                "Q", "Z",
                "", ""));
    public Tile(){
        int r = (int)(Math.random() * 100);
        this.letter = letters.get(r);
        if(r < 68){
            this.value = 1;
        }else if(r < 75){
            this.value = 2;
        }else if(r < 83){
            this.value = 3;
        }else if (r < 93){
            this.value = 4;
        }else if (r == 93){
            this.value = 5;
        }else if(r < 96){
            this.value = 8;
        }else if(r < 98){
            this.value = 10;
        }else{
            this.value = 0;
        }
    }
    
    public String getLet(){
        return letter;
    }
    
    public int getValue(){
        return value;
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
