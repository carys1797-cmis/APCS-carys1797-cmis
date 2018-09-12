public class Fundamentals1Quiz
{
    public static int method1(int a, int b, int c){
        int product = 0;
        boolean isposa = a > 0;
        boolean isposb = b > 0;
        boolean isposc = c > 0;
        if (isposa == false && isposb == false && isposc == false){
            a *= -1;
            b *= -1;
            c *= -1;
        }
        if ((a > b || a > c) && (b > a || b > c)){
                product = a * b;
            }else if ((c > b || c > a) && (b > a || b > c)){
                product = b * c;
            }else if ((a > b || a > c) && (c > a || c > b)){
                product = a * c;
        }
        if (isposa == true && isposb == true && isposc == false){
            if (a * b > product){
                product = a * b;
            }
        } else if (isposa == true && isposb == false && isposc == true){
            if (a * c > product){
                product = a * c;
            }
        }else if (isposa == false && isposb == true && isposc == true){
            if (b * c > product){
                product = b * c;
            }
        }
        return product;
    }

    public static int method2(int a, int b){
        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum += (i * b);
        }
        return sum;
    }

    public static String method3(int h, int w) {
        String out = "";
        if (h < 0 || h % 2 == 0 || w < 0 || w % 2 == 0){
            out += "+";
        }else{
            for (int y = 1; y <= h; y++){
                if (y == (h/2) + 1){
                    for (int x = 1; x <= w; x++){
                        if (x == (w /2) + 1){
                            out += "+";
                        }else {
                            out += "-";
                        }
                    }
                    out += "\n";
                }else{
                    for (int x = 1; x <= w; x++){
                        if (x == (w/2) + 1){
                            out += "|";
                        }else {
                            out += " ";
                        }
                    }
                    out += "\n";
                }
            }
        }
        return out;
    }

    public static void main (String args[]){
        System.out.println(method1(-3, -4, -5));

        System.out.println(method2(10, -1000));

        System.out.println(method3(5, -7));

    }
}