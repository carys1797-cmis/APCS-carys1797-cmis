
public class PostGraduate extends Graduate
{
    public PostGraduate(){
       super();
   }
   
   public PostGraduate(String fn, String m, int ut){
       super(fn, m, ut);
   }
   
   public int calculateTuition(int units){
       return units * 750;
   }
}
