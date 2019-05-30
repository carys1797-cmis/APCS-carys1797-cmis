import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player1 extends World
{
    public Player1(String p1)
    {
        super(1200, 700, 1);
        showText(p1 + "'s Turn", getWidth()/2, getHeight()/2);
    }
}
