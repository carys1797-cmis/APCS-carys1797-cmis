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
        Random rand = new Random();
        int r = rand.nextInt(50);
        //move left until up is clear or down is clear
        if (isClearRight() == true && r < 40){
            right();
        }else if (isClearUp() == true || isClearDown() == true){
            if (r < 25){
                if (isClearUp() == true){
                    up();
                }else if (isClearDown() == true){
                    down();
                }
            }else if (r >= 25){
                if (isClearDown() == true){
                    down();
                }else if (isClearUp() == true){
                    up();
                }
            }
        }
        left();
    }
}
