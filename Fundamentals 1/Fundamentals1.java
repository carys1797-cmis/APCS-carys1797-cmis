public class Fundamentals1
{
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    public static int subtract(int a, int b) {
        int difference = a - b;
        return difference;
    }
    
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    
    public static int divide(int a, int b) {
        int quotient = a / b;
        return quotient;
    }
        
    public static void main ( String args[] )
        {
         System.out.println("Number of students in 7th grade: " + add(19, 24));
         System.out.println("Number of sweets left: " + subtract(32, 17));
         System.out.println("Slices of pizza: " + multiply(4, 8));
         System.out.println("Number of footballs needed: " + divide(18, 2));
        } // end method main
} // end class Fundamentals1