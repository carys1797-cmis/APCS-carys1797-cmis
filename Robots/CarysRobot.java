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
            if (isClearUp() == true && getData(1) == 0){
                if(isClearRight() == false && isClearLeft() == false){
                    down();
                    setData(1, 1);
                }
                up();
            }
            if (isClearLeft() == true){
                left();
            }
            if (isClearUp() == false && isClearLeft() == false){
                setData(1, 0);
                setData(0, 1); //data[0] = 1 means on left wall
            }
        }else if (getData(0) == 1){
            if (isClearRight() == true){
                if (isClearUp() == false && isClearDown() == false && getData(3) == 1){
                    left();
                    setData(2, 1);
                    setData(0, 2);
                    setData(9, 3);
                }
                right();
                setData(2, getData(2) + 1);
                if (getData(1) == 0 && isClearRight() == false){
                    setData(1, getData(2));
                    System.out.println("index 1: " + getData(1));
                }
                if (isClearRight() == false){
                    if (getData(2) != getData(1)){
                        System.out.println(getData(2));
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
                if (isClearUp() == false && isClearDown() == false && getData(3) == 1){
                    right();
                    setData(2, 1);
                    setData(0, 1);
                    setData(9, 4);
                    System.out.println(Arrays.toString(getData()));
                }
                left();
                setData(2, getData(2) + 1);
                if (isClearLeft() == false){
                    if (getData(2) != getData(1)){
                        System.out.println(getData(2));
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
            int[] n = {0, 0, 0, 1, 0, 0, 0, 0, 0, 4};
            if (getData(1) == 0){
                if(isClearRight() == false){
                    setData(1, 1);
                }else if (isClearLeft() == false){
                    setData(1, 3);
                }
            }else if (getData(1) == 1){
                if(isClearRight() == false){
                    if (isClearLeft() == false){
                        up();
                        setData(n);
                    }
                    up();
                    setData(2, getData(2) + 1);
                    System.out.println(getData(2));
                }else if (isClearRight() == true && getData(2) == 5){
                    System.out.println("door");
                    right();
                    if (isClearUp() == true){
                        setData(n);
                    }
                }else{
                    setData(2, 0);
                    setData(1, 2);
                    right();
                }
            }else if (getData(1) == 2){
                if (isClearDown() == false){
                    if (isClearUp() == false){
                        right();
                        setData(n);
                    }
                    right();
                    setData(2, getData(2) + 1);
                    System.out.println(getData(2));
                }else if (isClearDown() == true && getData(2) == 5){
                    System.out.println("door");
                    down();
                    if (isClearRight() == true){
                        setData(n);
                    }
                }else {
                    setData(2, 0);
                    setData(1, 3);
                    down();
                }
            }else if (getData(1) == 3){
                if(isClearLeft() == false){
                    if (isClearRight() == false){
                        down();
                        setData(n);
                    }
                    down();
                    setData(2, getData(2) + 1);
                    System.out.println(getData(2));
                }else if (isClearLeft() == true && getData(2) == 5){
                    System.out.println("door");
                    left();
                    if (isClearUp() == true){
                        setData(n);
                    }
                }else {
                    setData(2, 0);
                    setData(1, 4);
                    left();
                }
            }else if (getData(1) == 4){
                if(isClearUp() == false){
                    if (isClearDown() == false){
                        left();
                        setData(n);
                    }
                    left();
                    setData(2, getData(2) + 1);
                    System.out.println(getData(2));
                }else if (isClearUp() == true && getData(2) == 5){
                    System.out.println("door");
                    up();
                    if (isClearRight() == true){
                        setData(n);
                    }
                }else {
                    System.out.println(Arrays.toString(getData()));
                    setData(2, 0);
                    setData(1, 1);
                    up();
                }
            }
        }
    }
}


//if robot hits from left (moving right) 1 block above door: getData(2) == 5 when hits the top so getData(0) == 0 & robot continues to top left of screen
//if robot goes straight into door