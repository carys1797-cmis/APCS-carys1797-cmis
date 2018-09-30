import java.util.Arrays;
public class Random
{
   public static void main(String args[]){
       System.out.println(3 / 2);
       
      
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
       
       
       int[] intArray = {34, 1, 859, 66, 10};
       double[] doubleArray = {24.29, 0.12345, 7.0, 693.0, 416.938502, 0.0};
       String[] stringArray = {"Carys", "Punch", "Zoe", "Jemima", "Lydia"};

       int[] ya = new int[6];
       ya = intArray;
       System.out.println(Arrays.toString(ya));
   }
   

}
