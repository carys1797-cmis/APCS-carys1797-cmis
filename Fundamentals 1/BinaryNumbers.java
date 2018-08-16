public class BinaryNumbers
{
    public static byte bn(byte a) {
        return a;
    }
    
    public static int add(byte a, byte b) {
        int sum = a + b;
        return sum;
    }
    
    public static void main ( String args[] )
        {
        byte a = 0b00010111;
        byte b = 0b01000101;
        byte c = 0b01111010;
        byte d = 0b01000010;
        byte e = 0b01111111;
         System.out.println(bn(a));
         System.out.println(bn(b));
         System.out.println(bn(c));
         System.out.println(bn(d));
         System.out.println(bn(e));
        } // end method main
} // end class BinaryNumbers