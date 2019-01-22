
public class MergeSort
{
    public static void main(String args[]){
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
        int[] result = new int[len];
        boolean sortedf = false;
        boolean sortedb = false;
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
            if(arrayBack.length == 1){
                int combinedlen = arrayFront.length + arrayBack.length;
                int f = 0;
                int b = 0;
                for(int i = 0; i < combinedlen; i++){
                    if(f == arrayFront.length){
                        result[i] = arrayBack[b];
                        b++;
                    }else if(b == arrayBack.length){
                        result[i] = arrayFront[f];
                        f++;
                    }else if(arrayFront[f] < arrayBack[b]){
                        result[i] = arrayFront[f];
                        f++;
                    }else if(arrayBack[b] < arrayFront[f]){
                        result[i] = arrayBack[b];
                        b++;
                    }
                }
                print(result);
            }else{
                mergeSort(arrayBack);
            }
        }else{
            mergeSort(arrayFront);
        }
        print(result);
    }
    //split
    //mergeSort
    //merge:
        //first of front, first of back
}
