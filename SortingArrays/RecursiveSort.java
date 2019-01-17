
public class RecursiveSort
{
    public static void main(String args[]){
        System.out.println(multiply(-15,3));
        System.out.println(divide(-12,-2));
        System.out.println(power(5,5));
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
                int quotient = 1 + divide(a, b);
                return quotient;
            }else{
                a += b;
                int quotient = -1 + divide(a, b);
                return quotient;
            }
        }
    }

    public static int power(int a, int b){
        if (b == 0){
            return 1;
        }else if (b == 1){
            return a;
        }else {
            b--;
            int result = multiply(a, power(a, b));
            return result;
        }
    }
}

