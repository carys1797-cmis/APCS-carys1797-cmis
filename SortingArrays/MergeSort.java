
public class MergeSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        mergeSort(numbers);
        //print(numbers);
    }
    
    public static void print(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void mergeSort(int[] array){
        int len = array.length;
        int[] arrayFront = new int[len / 2];
        for(int i = 0; i < arrayFront.length; i++){
            arrayFront[i] = array[i];
        }
        int[] arrayBack = new int[(len + 1) / 2];
        for (int i = 0; i < arrayBack.length; i++){
            arrayBack[i] = array[i + arrayFront.length];
        }
        //print(arrayFront);
        //print(arrayBack);
        if (arrayFront.length == 1){
            System.out.println("Split");
            if(arrayBack.length == 1){
                System.out.println("Split");
                print(arrayFront);
                print(arrayBack);
            }else{
                print(arrayBack);
                mergeSort(arrayBack);
            }
        }else{
            print(arrayFront);
            mergeSort(arrayFront);
        }
    }
    //split
    //mergeSort
    //merge
}
