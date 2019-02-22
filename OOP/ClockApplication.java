import java.util.Scanner;

public class ClockApplication
{
    public static void main (String arg[]){
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
        Scanner reader = new Scanner(System.in);
        System.out.println("Hours: ");
        int hrs = reader.nextInt();
        System.out.println("Minutes: ");
        int mins = reader.nextInt();
        System.out.println("Seconds: ");
        int secs = reader.nextInt();
        Clock bedroomClock = new Clock(hrs, mins, secs);
        System.out.println(bedroomClock);
    }
}
