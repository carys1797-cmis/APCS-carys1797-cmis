import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Board extends World
{
    
    public Board(String p1, String p2)
    {
        super(634, 730, 1);
        GreenfootImage grid = new GreenfootImage("Board.png");
        grid.scale(634, 730);
        setBackground(grid);
        Game scrabble = new Game();
        scrabble.act(p1, p2);
        addObject(scrabble, 1, 1);
    }
}
