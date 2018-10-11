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
        int i = 0;
        if (isClearRight() == true){
            right();
            while (getData(i) != 0){
                i++;
                if (i == 10){
                    i = 0;
                }
            }
            setData(i, 1); //1 means right
        }else if (isClearUp() == true){
            for (int j = 0; j < 9; j++){
                if (getData(j) == 2 && getData(j+1) == 3){
                    down();
                }
            }
            up();
            while (getData(i) != 0){
                i++;
                if (i == 10){
                    i = 0;
                }
            }
            setData(i, 2); //2 means up
        }else if (isClearDown() == true){
            down();
            while (getData(i) != 0){
                i++;
                if (i == 10){
                    i = 0;
                }
            }
            setData(i, 3); //3 means up
        }else {
            left();
        }
    }
}
