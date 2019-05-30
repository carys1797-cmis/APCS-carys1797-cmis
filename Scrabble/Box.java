import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Box extends Actor
{
    private GreenfootImage box;
    private int wl;
    
    public Box(int x, int y){
        box = new GreenfootImage(x, y);
        setImage(box);
        this.wl = 7;
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            box.setColor(Color.YELLOW);
            box.fill();
        }
    }    
}
