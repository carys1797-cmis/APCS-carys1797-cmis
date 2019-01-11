
public class SelectionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void sort(int[] array){
        int index = 0;
        int min;
        int position = 0;
        while (index < array.length - 1){
            min = array[index];
            for(int x = index + 1; x < array.length; x++){
                if (array[x] < min){
                    min = array[x];
                    position = x;
                }
            }
            array[position] = array[index];
            array[index] = min;
            index++;
        }
    }
}