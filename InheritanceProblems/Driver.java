import java.util.*;
public class Driver
{

    public static void main(String args[]){
        Television hd = new Television("HD Bronze", 59.99);
        DLP dlp = new DLP("DLP Silver", 99.99);
        LCD lcd = new LCD("LCD Gold", 199.99);
        LED led = new LED("LED Platinum", 399.99);
        Plasma plasma = new Plasma("Plasma Sapphire", 499.99);
        
        List<Television> TVs = new ArrayList<Television>();
        TVs.add(hd);
        TVs.add(dlp);
        TVs.add(lcd);
        TVs.add(led);
        TVs.add(plasma);
        System.out.println("TVs in the store...");
        for(Television tv : TVs){
            System.out.println(tv);
        }
    }
}
