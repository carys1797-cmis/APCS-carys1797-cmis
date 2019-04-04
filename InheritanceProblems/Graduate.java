
public class Graduate extends Student
{
    public Graduate(){
       super("John", "English", 6);
   }
   
   public Graduate(String fn, String m, int ut){
       super(fn, m, ut);
   }
   
   public int calculateTuition(int units){
       return units * 500;
   }
}
