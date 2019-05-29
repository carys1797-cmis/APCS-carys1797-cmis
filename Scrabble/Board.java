import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Board extends World
{
    public Board()
    {
        super(634, 730, 1);
        GreenfootImage grid = new GreenfootImage("Board.png");
        grid.scale(634, 730);
        setBackground(grid);
    }
}
