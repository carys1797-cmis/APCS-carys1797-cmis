import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CjoRobot extends Robot
{
    public CjoRobot(){
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
        //keep going up(); until isClearRight() == true;
            //if isClearUp is not longer == true, go down();
                //if isClearDown == false, go left(), until isClearUp/Down == true;
        if (isClearRight() == true){
            right();
        } else if (isClearRight() == false) {
            while (isClearUp() == true && isClearRight() == false) {
                up();
            }
            if (isClearRight() == true){
                right();
            }else if (isClearUp() == false){
                while (isClearDown() == true && isClearRight() == false){
                    down();
                }
                if (isClearRight() == true){
                    right();
                }else if (isClearDown() == false){
                    while (isClearLeft() == false){
                        up();
                    }
                    while (isClearUp() == false){
                        left();
                    }
                }
            }
        }
    }
}
