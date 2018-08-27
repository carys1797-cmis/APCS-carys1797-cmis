import java.util.Scanner;
import java.util.Random;


public class Fundamentals1
{   
    public static void dataTypes() {
        String abyte = "A byte is an 8-bit integer. With a minimum value of -128 and a maximum value of 127, it is the smallest data type. Some situations in which the byte data type might be used is for number of students in CMIS class at CMIS, the day of the month, or the change of rank of song within top 100.";
        byte numstu = 10; //number of students in AP Computer Science
        System.out.println(abyte + numstu);
        String ashort = "Short data type is a 16-bit integer. It has a minimum value of -32,768 and a maximum value of 32,767. Some examples of when this data type might be used in the real world is for the number of skips someone can do in a minute, the hourly change in people in stadium, or perhaps a person's weight in pounds.";
        short numskp = 332; //Guiness World record for skips in a minute
        System.out.println(ashort + numskp);
        String anint = "An integer is a 32-bit integer. It is the default data type with a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647. In the real world, an integer could be used for the population of a country, the daily change in library books loaned, or the number of active users on facebook at any given time.";
        int chngbk = -8345000; //change in library books loaned at the Library of Congress
        System.out.println(anint + chngbk);
        String along = "The long data type is a 64-bit integer. It has a min value of -9,223,372,036,854,775,808 and a max value of 9,223,372,036,854,775,807. Some situations in which this data type might be used is for the yearly increase/decrease of stars being born, the grains of sand on a beach, the number of bytes transferred over the internet per day.";
        long grains = 7500000000000000000L;
        System.out.println(along + grains);
        String afloat = "The float data type is a 32-bit floating point. This means that it can hold decimal values. This data type could be used for the height of a place above sealevel (in feet), the temperature, or a student's percentage on a test.";
        float abovesea = -282.0f; //height of Death Valley above sea level (in feet)
        System.out.println(afloat + abovesea);
        String adouble = "The double data type is a 64-bit floating point. This is the default data type for decimal values. The double data type can be used for extremely precise numbers such as the measurement of ingredients when making medicine, the landing coordinates for a spaceship, or even the size of an atom.";
        double hydroatom = 0.000000000053; //the size of a hydrogen atom
        System.out.println(adouble + hydroatom);
        String aboolean = "The boolean data type represents one bit of information. There are only two possible values: true and false. This data type could be used to determine the validity of the following statements: it is raining; the temperature is too high; oxygen levels are too low.";
        boolean rain = false; //it is raining
        System.out.println(aboolean + rain);
        String achar = "The char data type is a 16-bit Unicode character. It can store any of 65,535 characters in the unicode \"dictionary\". It can be used for the first letter of someone's name, for a student's grade in a class, to describe the type of money (the symbol).";
        char flname = 'c'; //first letter of my name
        System.out.println(achar + flname);
    }
    
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    public static int sub(int a, int b) {
        int difference = a - b;
        return difference;
    }
    
    public static int mul(int a, int b) {
        int product = a * b;
        return product;
    }
    
    public static int div(int a, int b) {
        int quotient = a / b;
        return quotient;
    }
    
    public static double add(double a, double b) {
        double sum = a + b;
        return sum;
    }
    
    public static double sub(double a, double b) {
        double difference = a - b;
        return difference;
    }
    
    public static double mul(double a, double b) {
        double product = a * b;
        return product;
    }
    
    public static double div(double a, double b) {
        double product = a / b;
        return product;
    }
    
    public static void compare(int a, int b){
        if (a > b){
            System.out.println("The value of a is " + a + " and it is greater than b whose value is " + b + ".");
        } else if (a < b){
            System.out.println("The value of a is " + a + " and it is less than b whose value is " + b + ".");
        } else {
            System.out.println("The value of a is " + a + " and it is equal to b whose value is " + b + ".");
        }
    }
    
    public static int evenOddZero(int a) {
        if (a == 0) {
            return 0;}
        else {
            int evo = a % 2;
            if (evo > 0) {
                return -1;}
            else {
            return 1;}
        }
    }
    
    public static void sqareTable() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers){
            Random rand = new Random();
            int r = rand.nextInt(item*item) + 1;
            System.out.println(item + "\t" + item*item + "\t" + r);
        }
    }
    
    public static int triangle(int a) {
        int sum = 0;
        for (int i = a; i > 0; i--) {
            sum = sum + i;
        }
        return sum;
    }
    
    public static int pyramid(int a) {
        int product = 0;
        for (int i = a; i > 0; i--) {
            product = product + (i * i);
        }
        return product;
    }
    
    public static void checkerboard(int h, int w){
        Random rand = new Random();
        int r = rand.nextInt(9) + 1;
        String firstline = "+";
        for(int i = w; i > 0; i--){
            firstline = firstline + "-";
        }
        firstline = firstline + "+";
        String body = "";
        for(int j = h; j > 0; j--){
            body = body + "|";
            if(j % 2 == 1){
                for(int i = w; i > 0; i--){
                    if (i % 2 == 0){
                        body = body + "#";
                    }else {
                        body = body + " ";
                    }
                }
                body = body + "|" + "\n";
            }else {
                for(int i = w; i > 0; i--){
                    if (i % 2 == 0){
                        body = body + " ";
                    }else {
                        body = body + "#";
                    }
                }
                body = body + "|" + "\n";
            }
        }
        String lastline = "+";
        for(int i = w; i > 0; i--){
            lastline = lastline + "-";
        }
        int len = body.length();
        int p = rand.nextInt(len);
        while (body.charAt(p) != '#'){
            p = rand.nextInt(len);
        }
        if (body.charAt(p) == '#'){
            body = body.substring(0, (p)) + r + body.substring(p+1);
        }
        lastline = lastline + "+";
        System.out.println(firstline + "\n" + body + lastline);
    }
    
    private static final int a = 729;
    private static final int b = 35;
    private static final double c = 92.43;
    private static final double d = 3402.1;
   
    public static void main ( String args[] )
        {
          dataTypes();
          System.out.println(a + " + " + b + " = " + add(a, b));
          System.out.println(a + " x " + b + " = " + mul(a, b));
          System.out.println(c + " + " + d + " = " + add(c, d));
          System.out.println(c + " x " + d + " = " + mul(c, d));
          
          Scanner reader = new Scanner(System.in);
          System.out.println("Enter an integer: ");
          int w = reader.nextInt();
          System.out.println("Enter another integer: ");
          int x = reader.nextInt();
          System.out.println(w + " - " + x + " = " + sub(w, x));
          System.out.println(w + " / " + x + " = " + div(w, x));
          
          System.out.println("Enter a decimal: ");
          double y = reader.nextDouble();
          System.out.println("Enter another decimal: ");
          double z = reader.nextDouble();
          System.out.println(y + " - " + z + " = " + sub(y, z));
          System.out.println(y + " / " + z + " = " + div(y, z));
        
         
          compare(35, 72);
          System.out.println(evenOddZero(16));
          
          sqareTable();
          System.out.println(triangle(10));
          System.out.println(pyramid(10));
          
          checkerboard(3,3);
        } // end method main
} // end class Fundamentals1
