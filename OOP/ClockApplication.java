
public class ClockApplication
{
    public static void main (String arg[]){
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
        Clock bedroomClock = new Clock(14, 12, 52);
        System.out.println(bedroomClock);
    }
}
