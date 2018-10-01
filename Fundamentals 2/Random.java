import java.util.Arrays;
public class Random
{
   public static void main(String args[]){
       System.out.println(3 / 2);
       
       int[] intArray = {1, 2, 3, 4, 5};

       int[] ya = new int[6];
       ya = intArray;
       System.out.println(Arrays.toString(ya));
       
       System.out.println(Arrays.toString(randomInts(10, 1, 10)));
   }
   
   public static int[] randomInts(int n, int min, int max){
        int[] randInts = new int[n];
        int range = (max - min) + 1;
        for (int i = 0;  i < n; i++){
            randInts[i] = (int) (Math.random() * range) + min;
        }
        return randInts;
    }
    

}
