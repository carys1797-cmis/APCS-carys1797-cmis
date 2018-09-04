public class BinaryConverter
{
    public static void main(String args[]){
        System.out.println("BinaryConverter");
        System.out.println(bin2dec("10110010101011001101001101001010"));
        System.out.println(bin2dec("00110010101011001101001101001010"));
        System.out.println(dec2bin(42));
        System.out.println(dec2bin(-42));
    }
    
    public static int bin2dec(String bin) {
        /*
         * Takes a String that looks like a 32-bit binary number and returns
         * the equivalent int value
         */
        int asint = 0;
        int len = bin.length();
        if (bin.charAt(0) == '0'){
            for (int i = 1; i < len; i++){
                int p = len - i;
                if (bin.charAt(p) == '1'){
                    asint += Math.pow(2, (i-1));
                }else {
                    continue;
                }
            }
            return asint;
        }else {
            if (bin.charAt(len-1) == '1'){
                bin = bin.substring(0, len-1) + "0";
            }else if (bin.charAt(len-1) == '0') {
                for (int i = 2; i < len; i++) {
                    if (bin.charAt(len-i) == '1') {
                        bin = bin.substring(0, len-i) + "0";
                        for (int j = 1; j < i; j++) {
                            bin += "1";
                        }
                    }
                    break;
                }
            }
            for (int i = 0; i < len; i++) {
                if (bin.charAt(i) == '1'){
                    bin = bin.substring(0, i) + "0" + bin.substring(i+1);
                }else if (bin.charAt(i) == '0'){
                    bin = bin.substring(0, i) + "1" + bin.substring(i+1);
                }
            }
            for (int i = 1; i < len; i++){
                int p = len - i;
                if (bin.charAt(p) == '1'){
                    asint += Math.pow(2, (i-1));
                }else {
                    continue;
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
        String bin = "";
        int dec2 = dec;
        if (dec < 0){
            dec *= -1;
        }
        bin += "0";
        for (int i = 31; i >= 0; i--){
            if (dec - Math.pow(2, i) < 0) {
                bin += "0";
            }else if (dec - Math.pow(2, i) >= 0) {
                bin += "1";
                dec -= Math.pow(2, i);
            }
        }
        int len = bin.length();
        if (dec2 < 0){
            for (int i = 0; i < len; i++) {
                if (bin.charAt(i) == '1'){
                    bin = bin.substring(0, i) + "0" + bin.substring(i+1);
                }else if (bin.charAt(i) == '0'){
                    bin = bin.substring(0, i) + "1" + bin.substring(i+1);
                }
            }
            if (bin.charAt(len-1) == '0'){
                bin = bin.substring(0, len-1) + "1";
            }else if (bin.charAt(len-1) == '1') {
                for (int i = 2; i < len; i++) {
                    if (bin.charAt(len-i) == '0') {
                        bin = bin.substring(0, len-i) + "1";
                        for (int j = 1; j < i; j++) {
                            bin += "0";
                        }
                    }
                    break;
                }
            }
        }
        return bin;
    }
}