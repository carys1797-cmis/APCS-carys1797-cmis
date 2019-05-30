import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player1 extends World
{
    private String displayText;
    public Player1(String p1, String p2)
    {
        super(1200, 700, 1);
        displayText = p1 + "'s Turn";
        showText(displayText, getWidth()/2, getHeight()/2);
    }
    
    public String getText(){
        return displayText;
    }
    
    public void setText(String newtext){
        displayText = newtext;
        showText(displayText, getWidth()/2, getHeight()/2);
    }
}
