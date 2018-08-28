public class BinaryConverter
{
    public static void main(String args[]){
        System.out.println("BinaryConverter");
        //System.out.println(bin2dec("00110010101011001101001101001010"));
        System.out.println(dec2bin(52));
    }
    
    public static int bin2dec(String bin){
        String bin2 = "0b" + bin;
        //int bin2;
        int asint = Integer.valueOf(bin2).intValue();
        
        /*
         * Takes a String that looks like a 32-bit binary number and returns
         * the equivalent int value
         */
        return asint;
    }
    
    public static String dec2bin(int dec){
        String bin = Integer.toBinaryString(dec);

        /*
         * Takes an int as an argument and returns a String representation
         * of the 32 bit binary.
         */
        return bin;
    }
}