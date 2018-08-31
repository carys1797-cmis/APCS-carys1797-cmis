public class BinaryConverter
{
    public static void main(String args[]){
        System.out.println("BinaryConverter");
        System.out.println("10110010101011001101001101001010 = " + bin2dec("10110010101011001101001101001010"));
        System.out.println("52 = " + dec2bin(52));
        String ya = "ya";
        System.out.println(ya.length());
    }
    
    public static int bin2dec(String bin){
        int asint = Integer.parseInt(bin, 2);
        
        /*
         * Takes a String that looks like a 32-bit binary number and returns
         * the equivalent int value
         */
        return asint;
    }
    
    public static int trying (String bin) {
        int asint = 0;
        int len = bin.length();
        if (bin.charAt(0) == '0'){
            for (int i = 1; i < len; i++){
                int p = len - i;
                if (bin.charAt(p) == '1'){
                    asint += 2 ^ i;
                }else {
                    continue;
                }
            }
            
        }else {
            if (bin.charAt(-1) == '1'){
                bin = bin.substring(0, len-1) + "0";
            }
            
        }
        return 1;
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