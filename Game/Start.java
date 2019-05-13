import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    
    
    public Start()
    {    
        super(1406, 698, 1);
        showText("Click the button to begin", getWidth()/2, getHeight()/4);
        Button startb = new Button();
        addObject(startb, getWidth()/2, getHeight()/2);
    }
}
