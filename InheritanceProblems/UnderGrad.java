
public class UnderGrad extends Student
{
   public UnderGrad(){
       super("John", "English", 6);
   }
   
   public UnderGrad(String fn, String m, int ut){
       super(fn, m, ut);
   }
   
   public int calculateTuition(int units){
       return units * 250;
   }
}
