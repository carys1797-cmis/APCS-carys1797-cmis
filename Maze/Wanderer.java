import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Arrays;
public class Wanderer extends Robot
{
    public Wanderer(int d){
        super(Color.RED, d);
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
     * isClearRight() => true means no block to the left
     * isClearUp() => true means no block up
     * isClearDown() => true means no block down
     * getX() => returns x coordinate of robot
     * getY() => returns y coordinate of robot 
     * public final int[] getData() => returns array of int data
     * public final int getData(int idx) => returns int data from index idx
     * public final void setData(int idx, int value) => sets value of data array at idx
     * public final void setData(int[] newData) => replaces values in data array with values in newData
     */
    public void behave(){
        // (0) == x coordinate at intersection
        // (1) == y coordinate at intersection
        // (2) == which way robot was coming from when got to intersection
        // (3) == where robot is coming from
        // (4) == where robot is going
        
        boolean clearNotFromR = isClearRight() && getData(3) != 1;
        boolean clearNotFromD = isClearDown() && getData(3) != 2;
        boolean clearNotFromU = isClearUp() && getData(3) != 3;
        boolean clearNotFromL = isClearLeft() && getData(3) != 4;
        
        if (getData(0) == getX() && getData(1) == getY() && getData(5) == 2){
            System.out.println("Fix this!");
            setData(4, getData(2));
        }
        if (getData(4) == 0){
            if (clearNotFromR){
                if ((clearNotFromD || clearNotFromU || clearNotFromL) && getData(5) == 0){
                    setData(0, getX());
                    setData(1, getY());
                    setData(2, getData(3));
                }
                right();
                setData(4, 1);
            }else if (clearNotFromD){
                if ((clearNotFromR || clearNotFromU || clearNotFromL) && getData(5) == 0){
                    setData(0, getX());
                    setData(1, getY());
                    setData(2, getData(3));
                }
                down();
                setData(4, 2);
            }else if (clearNotFromU){
                if ((clearNotFromR || clearNotFromD || clearNotFromL) && getData(5) == 0){
                    setData(0, getX());
                    setData(1, getY());
                    setData(2, getData(3));
                }
                up();
                setData(4, 3);
            }else if (clearNotFromL){
                if ((clearNotFromR || clearNotFromD || clearNotFromU) && getData(5) == 0){
                    setData(0, getX());
                    setData(1, getY());
                    setData(2, getData(3));
                }
                left();
                setData(4, 4);
            }else {
                System.out.println("Turn Back   3:" + getData(3) + "    2:" + getData(2));
                setData(4, getData(3));
                setData(5, getData(5) + 1);
                if (getData(5) > 1){
                    System.out.println(getData(3));
                    //Write Code Here!
                }
            }
        }else if (getData(4) == 1){
            if (isClearRight() == true){
                right();
            }else {
                setData(3, 4);
                setData(4, 0);
                System.out.println(Arrays.toString(getData()));
            }
        }else if (getData(4) == 2){
            if (isClearDown() == true){
                down();
            }else {
                setData(3, 3);
                setData(4, 0);
                System.out.println(Arrays.toString(getData()));
            }
        }else if (getData(4) == 3){
            if (isClearUp() == true){
                up();
            }else {
                setData(3, 2);
                setData(4, 0);
                System.out.println(Arrays.toString(getData()));
            }
        }else if (getData(4) == 4){
            if (isClearLeft() == true){
                left();
            }else {
                setData(3, 1);
                setData(4, 0);
                System.out.println(Arrays.toString(getData()));
            }
        }

        //switch(Greenfoot.getRandomNumber(4)){
        //  case 0: up(); break;
        //case 1: down(); break;
        // case 2: left(); break;
        // case 3: right(); break;
        //}
    }
}

