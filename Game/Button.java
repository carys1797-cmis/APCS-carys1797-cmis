import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Button extends Actor
{
    private GreenfootImage button;
    
    public Button(){
        button = new GreenfootImage("Red Button.jpg");
        setImage(button);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Countries());
        }
    }    
}
