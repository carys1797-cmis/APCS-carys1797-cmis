
public class RecursiveSort
{
    public static void main(String args[]){
        System.out.println(multiply(-15,75));
        System.out.println(divide(-12,2));
    }

    public static int multiply(int a, int b){
        if (b == 0 || a == 0){
            return 0;
        }else if (b == 1){
            return a;
        }else{
            if (b > 1){
                b--;
                int product = a + multiply(a, b);
                return product;
            }else{
                b++;
                int product = - a + multiply(a, b);
                return product;
            }
        }
    }

    public static int divide(int a, int b){
        if (b == 1){
            return a;
        }else if (a == 0){
            return 0;
        }else {
            if ((a > 0 && b > 0) || (a < 0 && b < 0)){
                a -= b;
            }else if ((a < 0 && b > 0) || (a > 0 && b < 0)){
                a += b;
            }
            int quotient = 1 + divide(a, b);
            return quotient;
        }
    }
}

