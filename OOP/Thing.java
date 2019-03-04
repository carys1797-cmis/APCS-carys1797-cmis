
public class Thing
{
    private int field1 = 52;
    private double field2 = 3.74;
    private boolean field3 = false;
    private String field4 = "field4";

    public Thing(){
        this.field1 = 10;
        this.field2 = 10.10;
        this.field3 = true;
        this.field4 = "ten";
    }

    public Thing(int newValue){
        this();
        field1 = newValue;
        field3 = false;
    }

    public Thing(double newValueDob, String newValueStr){
        this(1);
        field2 = newValueDob;
        field4 = newValueStr;
    }

    public void setfield1(int newValue){
        this.field1 = newValue;
    }

    public int getfield1(){
        return field1;
    }

    public void setfield2(double newValue){
        this.field2 = newValue;
    }

    public double getfield2(){
        return field2;
    }

    public void setfield3(boolean newValue){
        this.field3 = newValue;
    }

    public boolean getfield3(){
        return field3;
    }

    public void setfield4(String newValue){
        this.field4 = newValue;
    }

    public String getfield4(){
        return field4;
    }
}
