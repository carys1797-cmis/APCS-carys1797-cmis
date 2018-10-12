import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.Arrays;
public class CarysRobot extends Robot
{
    public CarysRobot(){
        super(Color.RED);
    }

    public void init(){
        int[] start = {0, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        setData(start);
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
        if (getData(0) == 0){
            if (isClearUp() == true){
                up();
            }
            if (isClearLeft() == true){
                left();
            }
            if (isClearUp() == false && isClearLeft() == false){
                setData(0, 1); //data[0] = 1 means on left wall
            }
        }else if (getData(0) == 1){
            if (isClearRight() == true){
                right();
            }else if (getData(9) == 4){
                down();
                for (int i = 1; i < 10; i++){
                    if (getData(i) == 4){
                        setData(i, 3);
                        break;
                    }
                }
            }else if (getData(9) == 3){
                setData(0, 2);
            }
        }else if (getData(0) == 2){
            if (isClearLeft() == true){
                left();
            }else if (getData(9) == 3){
                down();
                for (int i = 1; i < 10; i++){
                    if (getData(i) == 3){
                        setData(i, 4);
                        break;
                    }
                }
            }else if (getData(9) == 4){
                setData(0, 1);
            }
        }
    }
}
