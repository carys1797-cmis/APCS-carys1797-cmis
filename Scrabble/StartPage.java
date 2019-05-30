import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartPage extends World
{
    public StartPage()
    {    
        super(1200, 700, 1);
        GreenfootImage bg = new GreenfootImage("Start Page.png");
        setBackground(bg);
        BeginButton beginb = new BeginButton();
        addObject(beginb, getWidth()/2, getHeight()*5/6);
    }
}

//Pick number of players: can click 2, 3, 4