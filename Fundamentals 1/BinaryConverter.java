public class BinaryConverter
{
    public static void main(String args[]){
        //System.out.println("BinaryConverter");
        //System.out.println("10110010101011001101001101001010 = " + bin2dec("10110010101011001101001101001010"));
        //System.out.println("52 = " + dec2bin(52));
        System.out.println(trying("00110010101011001101001101001010"));
        System.out.println(1700374164/2);
    }
    
    public static int bin2dec(String bin){
        /*
         * Takes a String that looks like a 32-bit binary number and returns
         * the equivalent int value
         */
        return 0;
    }
    
    public static int trying (String bin) {
        int asint = 0;
        int len = bin.length();
        if (bin.charAt(0) == '0'){
            for (int i = 1; i < len; i++){
                int p = len - i;
                if (bin.charAt(p) == '1'){
                    asint += Math.pow(2, i);
                    System.out.println(asint);
                }else {
                    continue;
                }
            }
            return asint;
        }else {
            if (bin.charAt(-1) == '1'){
                bin = bin.substring(0, len-1) + "0";
                for (int i = 0; i < len; i++) {
                    if (bin.charAt(i) == 1){
                        bin = bin.substring(0, i) + "0" + bin.substring(i+1);
                    }else if (bin.charAt(i) == 0){
                        bin = bin.substring(0, i) + "1" + bin.substring(i+1);
                    }
                }
                for (int i = 1; i < len; i++){
                    int p = len - i;
                    if (bin.charAt(p) == '1'){
                        asint += 2 ^ i;
                    }else {
                        continue;
                    }
                }
            }
            asint *= -1;
            return asint;
        }    
    }
        
    public static String dec2bin(int dec){
        /*
         * Takes an int as an argument and returns a String representation
         * of the 32 bit binary.
         */
        return "hi";
    }
}