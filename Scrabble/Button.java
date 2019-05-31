import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
public class Button extends Actor
{
    private GreenfootImage button;
    
    public Button(){
        button = new GreenfootImage("Begin Button.png");
        setImage(button);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            String p1name = JOptionPane.showInputDialog("Player 1 name: ");
            String p2name = JOptionPane.showInputDialog("Player 2 name: ");
            Greenfoot.setWorld(new Board(p1name, p2name));
        }
    }    
}
