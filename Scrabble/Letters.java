import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Letters extends Actor
{
    private List<String> letters;
    public Letters(){
        letters = new ArrayList<String>(
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
    }

    public int number(){
        return letters.size();
    }
    
    public String pick(){
        int r = (int)(Math.random() * 100);
        return letters.remove(r);
    }
    
    public int findLet(char let){
        return letters.indexOf(let);
    }
    
    public int getPoints(String let){
        int r = letters.indexOf(let);
        int p;
        if(r < 68){
            p = 1;
        }else if(r < 75){
            p = 2;
        }else if(r < 83){
            p = 3;
        }else if (r < 93){
            p = 4;
        }else if (r == 93){
            p = 5;
        }else if(r < 96){
            p = 8;
        }else if(r < 98){
            p = 10;
        }else{
            p = 0;
        }
        return p;
    }
    
    public void putBack(String let){
        letters.add(let);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
