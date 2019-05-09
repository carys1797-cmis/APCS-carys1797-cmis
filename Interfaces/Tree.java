
public class Tree implements Paintable, MovieCharacteristic
{
    int numofFruit;
    boolean leaves;
    String colour;
    
    public Tree(){
        this.colour = "green";
        this.numofFruit = 0;
        this.leaves = true;
    }
    
    public int getNofFruit(){
        return numofFruit;
    }
    
    public boolean getleaves(){
        return leaves;
    }
    
    public String getColour(){
        return colour;
    }
    
    public void growFruit(int n){
        this.numofFruit += n;
    }
    
    public void autumn(){
        this.leaves = false;
    }
    
    public void spring(){
        this.leaves = true;
        growFruit(24);
    }
    
    public void paint(String newC){
        this.colour = newC;
    }
    
    public String getName(){
        return "The Tree that Was";
    }
    
    public void output(){}
}
