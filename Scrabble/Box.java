import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Box extends Actor
{
    private GreenfootImage box;
    public Box(){
        box = new GreenfootImage(39, 40);
        setImage(box);
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            box.setColor(Color.YELLOW);
            box.fill();
        }
    }    
}
