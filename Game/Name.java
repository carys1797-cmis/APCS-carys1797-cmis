import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Name extends Actor
{
    private GreenfootImage box;
    
    public void act() 
    {
        box = new GreenfootImage(500,300);
        box.setColor(Color.BLACK);
        box.fill();
        setImage(box);
    }    
}
