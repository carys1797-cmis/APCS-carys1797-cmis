
public class StudentApplication
{
  public static void main(String args[]){
      Student senior001 = new Student();
      System.out.println(senior001);
      Student junior001 = new Student("Chloe", "Fernandez", 17, true);
      System.out.println(junior001);
      //JOptionPane.showMessageDialog(null, junior001);
  }
}
