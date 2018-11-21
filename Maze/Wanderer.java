import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        if (isClearRight() == true){
            right();
            for(int i = 0; i < 10; i++){
                if (getData(i) == 0){
                    setData(i, 1);
                    break;
                }
            }
        }else if (isClearDown() == true){
            down();
            for(int i = 0; i < 10; i++){
                if (getData(i) == 0){
                    setData(i, 2);
                    break;
                }
            }

        }else if (isClearUp() == true){
            up();
            for(int i = 0; i < 10; i++){
                if (getData(i) == 0){
                    setData(i, 3);
                    break;
                }
            }
        }else if (isClearLeft() == true){
            left();
            for(int i = 0; i < 10; i++){
                if (getData(i) == 0){
                    setData(i, 4);
                    break;
                }
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

