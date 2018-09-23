import java.util.Arrays;
public class Fundamentals2
{
    public static void main(String args[]){
        
        int[] intArray = {34, 1, 859, 66, 10};
        double[] doubleArray = {24.29, 0.12345, 7.0, 693.0, 416.938502};
        String[] stringArray = {"Carys", "Punch", "Zoe", "Jemima", "Lydia"};

        System.out.println(intArray[0]);
        System.out.println(doubleArray[2]);
        System.out.println(stringArray[4]);
        
        printArray(intArray, true);
        printArray(doubleArray, true);
        printArray(stringArray, false);
        System.out.println(Arrays.toString(randomInts(5, 10, 1)));
    }
    
    public static void printArray(int[] array, boolean skip){
        if (skip == false){
            for (int i = 0; i < array.length; i++){
                System.out.println("Array[" + i + "]: " + array[i]);
            }
        }else if (skip == true){
            for (int i = 0; i < array.length; i++){
                if (i % 2 == 0){
                    System.out.println("Array[" + i + "]: " + array[i]);
                }else {
                    continue;
                }
            }
        }
    }
    
    public static void printArray(double[] array, boolean skip){
        if (skip == false){
            for (int i = 0; i < array.length; i++){
                System.out.println("Array[" + i + "]: " + array[i]);
            }
        }else if (skip == true){
            for (int i = 0; i < array.length; i++){
                if (i % 2 == 0){
                    System.out.println("Array[" + i + "]: " + array[i]);
                }else {
                    continue;
                }
            }
        }
    }
    
    public static void printArray(String[] array, boolean skip){
        if (skip == false){
            for (int i = 0; i < array.length; i++){
                System.out.println("Array[" + i + "]: " + array[i]);
            }
        }else if (skip == true){
            for (int i = 0; i < array.length; i++){
                if (i % 2 == 0){
                    System.out.println("Array[" + i + "]: " + array[i]);
                }else {
                    continue;
                }
            }
        }
    }
    
    public static int[] randomInts(int n, int min, int max){
        int[] randInts = new int[n];
        int range = (max - min) + 1;
        for (int i = 0;  i < n; i++){
            randInts[i] = (int) (Math.random() * range) + min;
        }
        return randInts;
    }
    
    public static double[] randomDoubles(int n, double min, double max){
        double[] randDoubls = new double[n];
        int range = (int) (max - min) + 1;
        for (int i = 0;  i < n; i++){
            randDoubls[i] = (Math.random() * range) + min;
        }
        return randDoubls;
    }
    
    public static int[] copy(int[] array){
        
    }
}
