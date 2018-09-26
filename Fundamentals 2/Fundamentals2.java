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
        System.out.println(Arrays.toString(randomDoubles(7, 43.634, 2.19)));
        
        System.out.println(Arrays.toString(pairs(5)));
        
        int[] intArray2 = {1, 2, 3, 4, 5};
        
        System.out.println(Arrays.toString(concat(intArray, intArray2)));
        System.out.println(Arrays.toString(merge(intArray, intArray2)));
        
        
        reverse(intArray2);
        System.out.println(Arrays.toString(compareArrays(intArray, intArray2)) + "\n");
        
        double[] a = {2.5, 3.1, 4.6, 1.2};
        double[] b = {3.7, 2.1, 5.3, 2.1, 4.5};
        
        printArray(maxMerge(a, b), false);
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
    
    public static int[] concat(int[] a, int[] b){
        int[] out = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++){
            out[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            out[i + a.length] = b[i];
        }
        return out;
    }
    
    public static int[] merge(int[] a, int[] b){
        int[] out = new int[a.length + b.length];
        for (int i = 0; i < out.length; i++){
            if (i % 2 == 0){
                out[i] = a[i / 2];
            }else {
                out[i] = b[i/2];
            }
        }
        return out;
    }
    
    public static void reverse(int[] array){
        int var = 0;
        for (int i = 0; i < (array.length / 2); i++){
            var = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = var;
        }
        
        System.out.println(Arrays.toString(array));
    }
    
    public static int[] subArray(int[] array, int start, int stop){
        int[] subArray = new int[stop - start];
        for (int i = start; i < stop; i++){
            subArray[i - start] = array[i];
        }
        return subArray;
    }
    
    public static int[] compareArrays(int[] a, int[] b){
        int atotal = 0;
        int btotal = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > b[i]){
                atotal += 1;
            }else if (b[i] > a[i]){
                btotal += 1;
            }
        }
        int[] out = new int[a.length];
        if (atotal > btotal){
            out = a;
        }else if (btotal > atotal){
            out = b;
        }
        return out;
    }
    
    public static int[] minimize(int[] array, int threshold){
        int[] out = new int[array.length];
        for (int i = 0; i < out.length; i++){
            if (array[i] > threshold){
                out[i] = threshold;
            }else {
                out[i] = array[i];
            }
        }
        return out;
    }
    
    public static void maximize(int[] array, int threshold){
        for (int i = 0; i < array.length; i++){
            if (i < threshold){
                array[i] = threshold;
            }else {
                continue;
            }
        }
    }
    
    public static double[] maxMerge(double[] a, double[] b){
        int longer = 0;
        int shorter = 0;
        double[] aa;
        double[] bb;
        double[] nbb;
        if (a.length != b.length){
            if (a.length > b.length){
                longer = a.length;
                shorter = b.length;
                aa = a;
                bb = b;
            }else {
                longer = b.length;
                shorter = a.length;
                aa = b;
                bb = a;
            }
            nbb = new double[longer];
            for (int i = 0; i < shorter; i++){
                nbb[i] = bb[i];
            }
            for (int i = shorter; i < longer; i++){
                nbb[i] = 0.0;
            }
        }
        double[] out = new double[longer];
        for (int i = 0; i < longer; i++){
            if (aa[i] > nbb[i]){
                out[i] = aa[i];
            }else {
                out[i] = nbb[i];
            }
        }
        return out;
    }
    
}
