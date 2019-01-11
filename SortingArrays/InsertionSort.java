public class InsertionSort
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
        int max = array[0];
        int movingv;
        for(int x = 1; x < array.length; x++){
            if(array[x] >= max){
                max = array[x];
            }else if(array[x] < max){
                movingv = array[x];
                for(int i = x - 1; i >= 0; i--){
                    if (movingv < array[i]){
                        array[i+1] = array[i];
                        array[i] = movingv;
                    }else{
                        i = -1;
                    }
                }
            }
        }
        
    }
}