import java.util.Arrays;
public class FundamentalsIIQuiz
{
    public static int[] minmax(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
        }
        int[] minmax = {min, max};
        return minmax;
    }

    public static int[] filter(int[] array, int min, int max, boolean positive){
        int total = 0;
        if (positive == false){
            for (int i = 0; i < array.length; i++){
                if (array[i] < min || array[i] > max){
                    total++;
                }
            }
        }else if (positive == true){
            for (int i = 0; i < array.length; i++){
                if (array[i] >= min && array[i] <= max){
                    total++;
                }
            }
        }
        int[] out = new int[total];
        int x = 0;
        if (positive == false){
            for (int i = 0; i < array.length; i++){
                if (array[i] < min || array[i] > max){
                    out[x] = array[i];
                    x++;
                }
            }
        }else if (positive == true){
            for (int i = 0; i < array.length; i++){
                if (array[i] >= min && array[i] <= max){
                    out[x] = array[i];
                    x++;
                }
            }
        }
        return out;
    }

    public static void main(String args[]){
        int[] array4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result4 = minmax(array4);
        int[] array5 = {3, -1, 6, 10, 4, -8, 6, 9, -3};
        int[] result5 = minmax(array5);

        System.out.println(Arrays.toString(result4));
        System.out.println(Arrays.toString(result5));
        
        int[] array0 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result0 = filter(array0, 5, 7, false);
        //Contents of result0 => {0, 1, 2, 3, 4, 8, 9}

        int[] array1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result1 = filter(array1, 5, 7, true);
        //Contents of result1 => {5, 6, 7}

        int[] array2 = {3, -1, 6, 10, 4, -8, 6, 9, -3};
        int[] result2 = filter(array2, 1, 6, false);
        //Contents of result2 => {-1, 10, -8, 9, -3}

        int[] array3 = {3, -1, 6, 10, 4, -8, 6, 9, -3};
        int[] result3 = filter(array3, 1, 6, true);
        //Contents of result3 => {3, 6, 4, 6}
        
        System.out.println(Arrays.toString(result0));
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
        
    }
}
