
public class ThingApplication
{
    public static void main(String args[]){
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        thing1.setfield1(1);
        thing2.setfield1(2);
        thing1.setfield2(1.0);
        thing2.setfield2(2.0);
        thing1.setfield3(false);
        thing2.setfield3(true);
        thing1.setfield4("one");
        thing2.setfield4("two");
        System.out.println("Thing1: ");
        System.out.println(thing1.getfield1());
        System.out.println(thing1.getfield2());
        System.out.println(thing1.getfield3());
        System.out.println(thing1.getfield4());
        System.out.println("Thing2: ");
        System.out.println(thing2.getfield1());
        System.out.println(thing2.getfield2());
        System.out.println(thing2.getfield3());
        System.out.println(thing2.getfield4());
    }
}
