import java.util.Arrays;
public class Fundamentals2
{
    public static void main(String args[]){
        int[] intArray = {34, 1, 859, 66, 10};
        double[] doubleArray = {24.29, 0.12345, 7.0, 693.0, 416.938502};
        String[] stringArray = {"Carys", "Punch", "Zoe", "Jemima", "Lydia"};

        System.out.println(intArray[0]);
        System.out.println(doubleArray[2]);
        System.out.println(stringArray[4] + "\n" + "\n");

        boolean[] boolArray = {true, false, false, true, false};

        printArray(intArray, false);
        printArray(doubleArray, true);
        printArray(boolArray, true);
        printArray(stringArray, false);

        System.out.println("\n" + "\n" + lastItem(intArray));
        System.out.println(lastItem(doubleArray));
        System.out.println(lastItem(boolArray));
        System.out.println(lastItem(stringArray) + "\n" + "\n");

        System.out.println(middleItem(intArray));
        System.out.println(middleItem(doubleArray));
        System.out.println(middleItem(boolArray));
        System.out.println(middleItem(stringArray) + "\n" + "\n");

        System.out.println(Arrays.toString(randomInts(5, 10, 1)));

        System.out.println(Arrays.toString(pairs(5)));
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

    public static void printArray(boolean[] array, boolean skip){
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

    public static int lastItem(int[] array){
        return array[array.length - 1];
    }

    public static double lastItem(double[] array){
        return array[array.length - 1];
    }

    public static boolean lastItem(boolean[] array){
        return array[array.length - 1];
    }

    public static String lastItem(String[] array){
        return array[array.length - 1];
    }

    public static int middleItem(int[] array){
        int mid = 0;
        if (array.length % 2 == 0){
            mid = (array.length / 2) - 1;
        }else {
            mid = array.length / 2;
        }
        return array[mid];
    }

    public static double middleItem(double[] array){
        int mid = 0;
        if (array.length % 2 == 0){
            mid = (array.length / 2) - 1;
        }else {
            mid = array.length / 2;
        }
        return array[mid];
    }

    public static boolean middleItem(boolean[] array){
        int mid = 0;
        if (array.length % 2 == 0){
            mid = (array.length / 2) - 1;
        }else {
            mid = array.length / 2;
        }
        return array[mid];
    }

    public static String middleItem(String[] array){
        int mid = 0;
        if (array.length % 2 == 0){
            mid = (array.length / 2) - 1;
        }else {
            mid = array.length / 2;
        }
        return array[mid];
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
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static double[] copy(double[] array){
        double[] copy = new double[array.length];
        for (int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static boolean[] copy(boolean[] array){
        boolean[] copy = new boolean[array.length];
        for (int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static String[] copy(String[] array){
        String[] copy = new String[array.length];
        for (int i = 0; i < array.length; i++){
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] pairs(int n){
        int[] pairs = new int[n * 2];
        int x = 1;
        for (int i = 0; i < pairs.length; i++){
            pairs[i] = x * 2;
            pairs[i + 1] = x * 2;
            x += 1;
            i += 1;
        }
        return pairs;
    }
}
