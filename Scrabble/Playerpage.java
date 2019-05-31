import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Playerpage extends World
{
    private String displayText;
    private Button beginb;
    
    public Playerpage(String p1)
    {
        super(1200, 700, 1);
        displayText = "It's Your Turn";
        showText(displayText, getWidth()/2, getHeight()/2);
        beginb = new Button();
        addObject(beginb, getWidth()/2, getHeight()*5/6);
        //Greenfoot.delay(3);
        //Greenfoot.setWorld(new Board(p1));
    }
    
    public Button getB(){
        return beginb;
    }
    
    public String getText(){
        return displayText;
    }
    
    public void setText(String newtext){
        displayText = newtext;
        showText(displayText, getWidth()/2, getHeight()/2);
    }
}