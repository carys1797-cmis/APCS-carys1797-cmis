import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
public class CarysRobot extends Robot
{
    public CarysRobot(){
        super(Color.RED);
    }
    
    public void init(){
        
    }
    
    /**
     * What your robot can do:
     * right() => move 1 to the right
     * left() => move 1 to the left
     * up() => move 1 up
     * down() => move 1 down
     * isClearRight() => true means no block to the right
     * isClearLeft() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     */
    public void behave(){
        int r = (int) (Math.random() * 100) + 1;
        if (isClearRight() == true && r < 75){
            right();
        }else if (isClearUp() == true && r >= 75 && r < 85){
            up();
        }else if (isClearDown() == true && r >= 85 && r < 95){
            down();
        }else if (isClearLeft() == true && r >= 95){
            left();
        }
        
    }
}
