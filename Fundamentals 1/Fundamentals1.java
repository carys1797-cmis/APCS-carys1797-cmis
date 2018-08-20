import java.util.Scanner;
import java.util.Random;


public class Fundamentals1
{   
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
    
    public static double addd(double a, double b) {
        double sum = a + b;
        return sum;
    }
    
    public static double subd(double a, double b) {
        double difference = a - b;
        return difference;
    }
    
    public static double muld(double a, double b) {
        double product = a * b;
        return product;
    }
    
    public static double divd(double a, double b) {
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
        lastline = lastline + "+";
        System.out.println(firstline + "\n" + body + lastline);
    }
    
    public static void main ( String args[] )
        {
          //String ya = "yaah";
          //String yaa = ya.substring(0,1)+"e"+ya.substring(2);
          
          System.out.println(a + " + " + b + " = " + add(a, b));
          System.out.println(a + " x " + b + " = " + mul(a, b));
          System.out.println(c + " + " + d + " = " + addd(c, d));
          System.out.println(c + " x " + d + " = " + muld(c, d));
          
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
          System.out.println(y + " - " + z + " = " + subd(y, z));
          System.out.println(y + " / " + z + " = " + divd(y, z));
        
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
          checkerboard(3, 3);
        } // end method main
} // end class Fundamentals1
