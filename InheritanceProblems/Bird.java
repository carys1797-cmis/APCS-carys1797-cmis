import java.util.*;
public class Bird extends Animal
{
   private String colour;
   
   public Bird(){
       super(0, 0);
       this.colour = "";
   }
   
   public Bird(int x, int y, String c){
       super(x, y);
       this.colour = c;
       String feather = "";
       String head = "(o>";
       String upperBody = "\\\\_//)";
       String lowerBody = "\\_/_)";
       String feet = "_|_";
       String graphic = String.format("   \\\n   %s\n%s\n %s\n  %s\n", head, upperBody, lowerBody, feet);
       setGraphic(graphic);
   }
   
   public String getColor(){
       return colour;
   }
   
   public boolean eat(String what){
       if(what == "worms" || what == "seeds"){
           return true;
       }else{
           return false;
       }
   }
   
   public void fly(int x, int y){
       List<Integer> location = getLocation();
       location.set(0, x);
       location.set(1, y);
   }
   
   public String toString(){
       return String.format("Bird\n%s\nx: %d\ny: %d\n%s", getGraphic(), getLocation().get(0), getLocation().get(1), super.toString());
   }
}
