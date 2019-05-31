import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Playerpage extends World
{
    private String displayText;
    public Playerpage(String p1)
    {
        super(1200, 700, 1);
        displayText = p1 + "'s Turn";
        showText(displayText, getWidth()/2, getHeight()/2);
        Greenfoot.delay(3);
        //Greenfoot.setWorld(new Board(p1));
    }
    
    public String getText(){
        return displayText;
    }
    
    public void setText(String newtext){
        displayText = newtext;
        showText(displayText, getWidth()/2, getHeight()/2);
    }
}
