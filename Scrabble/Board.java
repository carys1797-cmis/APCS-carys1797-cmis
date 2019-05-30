import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Board extends World
{
    public Board(String p1, String p2)
    {
        super(634, 730, 1);
        GreenfootImage grid = new GreenfootImage("Board.png");
        grid.scale(634, 730);
        setBackground(grid);
        GreenfootImage rack = new GreenfootImage("Rack.jpg");
        //setImage(rack);
        int y = 25;
        while(y < 651){
            int x = 25;
            while(x < 634){
                Box box = new Box(39, 40);
                addObject(box, x, y);
                if(x == 109 || x == 192 || x == 359 || x == 526){
                    x += 41;
                }else {
                    x += 42;
                }
            }
            if(y == 109 || y == 276 || y == 401 || y == 526){
                y += 41;
            }else {
                y += 42;
            }
        }
        Game scrabble = new Game();
        addObject(scrabble, 1, 1);
    }
}
