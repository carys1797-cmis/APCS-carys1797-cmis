import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.Arrays;
public class CarysRobot extends Robot
{
    public CarysRobot(){
        super(Color.RED);
    }

    public void init(){
        int[] start = {0, 0, 0, 4, 4, 4, 4, 4, 4, 4};
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
                setData(2, getData(2) + 1);
                if (getData(1) == 0 && isClearRight() == false){
                    setData(1, getData(2));
                    System.out.println("index 1: " + getData(1));
                }
                if (isClearRight() == false){
                    if (getData(2) > getData(1)){
                        if(isClearUp() == true){
                            up();
                        }
                    }else if (getData(2) < getData(1)){
                        int[] n = {3, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                        setData(n);
                    }
                    setData(2, 0);
                }
            }else if (getData(9) == 4){
                down();
                for (int i = 3; i < 10; i++){
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
                setData(2, getData(2) + 1);
                if (isClearLeft() == false){
                    if (getData(2) > getData(1)){
                        if(isClearUp() == true){
                            up();
                        }
                    }else if (getData(2) < getData(1)){
                        int[] n = {3, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                        setData(n);
                    }
                    setData(2, 0);
                }
            }else if (getData(9) == 3){
                down();
                for (int i = 3; i < 10; i++){
                    if (getData(i) == 3){
                        setData(i, 4);
                        break;
                    }
                }
            }else if (getData(9) == 4){
                setData(0, 1);
            }
        }else if (getData(0) == 3){
            if (getData(1) == 0){
                if(isClearRight() == false){
                    setData(1, 1);
                }else if (isClearLeft() == false){
                    setData(1, 3);
                }
            }else if (getData(1) == 1){
                if(isClearRight() == false){
                    up();
                }else if (isClearRight() == true && getData(2) == 6){
                    System.out.println("door");
                    right();
                }else{
                    setData(2, 0);
                    setData(1, 2);
                    right();
                }
            }else if (getData(1) == 2){
                if(isClearDown() == false){
                    right();
                }else if (isClearDown() == true && getData(2) == 6){
                    System.out.println("door");
                }else {
                    setData(2, 0);
                    setData(1, 3);
                    down();
                }
            }else if (getData(1) == 3){
                if(isClearLeft() == false){
                    down();
                }else if (isClearLeft() == true && getData(2) == 6){
                    System.out.println("door");
                }else {
                    setData(2, 0);
                    setData(1, 4);
                    left();
                }
            }else if (getData(1) == 4){
                if(isClearUp() == false){
                    left();
                }else if (isClearUp() == true && getData(2) == 6){
                    System.out.println("door");
                }else {
                    setData(2, 0);
                    setData(1, 1);
                    up();
                }
            }
            setData(2, getData(2) + 1);
            System.out.println(getData(2));
        }
    }
}
