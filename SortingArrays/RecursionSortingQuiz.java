public class RecursionSortingQuiz
{
    public static void main(String[] args){
        //System.out.println("I'm ready to serve you!");
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        System.out.println(factorial(9));
        print(numbers);
        print(kiefferSort(numbers));
    }
    
    public static void print(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    /**
     * @param n the value
     * @return n!
     * 
     * Factorials
     * n! => n * n-1 * n-2 * ... * n -(n-1)
     * 10! => 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 => 3628800
     * 5! => 5 * 4 * 3 * 2 * 1 => 120
     * 0! => 1
     */
    public static int factorial(int n){
        if (n == 0  || n == 1){
            return 1;
        }else {
            int product = n * factorial(n - 1);
            return product;
        }
    }

    /**
     * @param array the array to be sorted
     * @return the array sorted
     */
    public static int[] kiefferSort(int[] array){
        int move;
        int randomIndex;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i + 1]){
                move = array[0];
                randomIndex = (int) (Math.random() * (array.length - 1)) + 1;
                array[0] = array[randomIndex];
                array[randomIndex] = move;
                kiefferSort(array);
            }
        }
        return array;
    }
}