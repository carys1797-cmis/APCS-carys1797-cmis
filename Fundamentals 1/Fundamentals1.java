import java.util.Scanner;
import java.util.Random;


public class Fundamentals1
{   
    public static void dataTypes() {
        String abyte = "number of students in a CMIS class, day of the month, change of rank of song within top 100";
        byte numstu = 10; //number of students in AP Computer Science
        String ashort = "number of skips someone can do in a minute, hourly change in people in stadium, person's weight in pounds";
        short numskp = 332; //Guiness World record for skips in a minute
        String anint = "population of a country, daily change in library books loaned, number of active users on facebook at any given time";
        int chngbk = -8345000; //change in library books loaned at the Library of Congress
        String along = "yearly increase/decrease of stars being born, grains of sand on a beach, the number of bytes transferred over the internet per day";
        long grains = 7500000000000000000L;
        String afloat = "feet above sealevel, temperature, percentage on a test";
        float abovesea = -282.0f; //height of Death Valley above sea level (in feet)
        //String adouble = "";
        //double;
        String aboolean = "It is raining, temperature is too high (for medicines), oxygen levels are too low (on an airplane)";
        boolean rain = false; //it is raining
        String achar = "first letter of someone's name, grade in a class, type of money (symbol)";
        char flname = 'c'; //first letter of my name
        //System.out.println(numstu, numskp, chngbk, grains, abovesea, rain, flname);
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
    
    private static final int a = 729;
    private static final int b = 35;
    private static final double c = 92.43;
    private static final double d = 3402.1;
   
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
                body = body + "#";
                for(int i = (w - 2); i > 0; i--){
                    body = body +" #";
                }
                body = body + "|" + "\n";
            }else {
                for(int i = (w - 2); i > 0; i--){
                    body = body + " #";
                }
                body = body + " |" + "\n";
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
    
    public static void main ( String args[] )
        {
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
        
          System.out.println("Enter an integer: a = ");
          int comp1 = reader.nextInt();
          System.out.println("Enter another integer: b = ");
          int comp2 = reader.nextInt();
          compare(comp1, comp2);
          
          System.out.println("Enter another integer: ");
          int evo = reader.nextInt();
          System.out.println(evenOddZero(evo));
          
          sqareTable();
          System.out.println(triangle(10));
          System.out.println(pyramid(10));
          
          checkerboard(3,3);
        } // end method main
} // end class Fundamentals1
