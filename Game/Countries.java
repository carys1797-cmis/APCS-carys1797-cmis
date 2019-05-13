import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Countries extends World
{

    public Countries()
    {    
        super(1406, 698, 1);
        GreenfootImage background = new GreenfootImage("World Map.png");
        background.scale(1406, 698);
        setBackground(background);
        Name name = new Name();
        addObject(name, 0, getHeight());
    }
}
