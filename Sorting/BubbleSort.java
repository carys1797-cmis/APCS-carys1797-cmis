public class BubbleSort
{
    public static int steps = 0;
    public static void main(String[] args){

    }

    public static int[] sort(int[] array){
        boolean sorted = false;
        steps++;
        while(!sorted){
            sorted = true;
            steps += 2;
            for(int i = 0;i < array.length-1; i++){
                steps += 5;
                if(array[i] > array[i + 1]){
                    steps += 8;
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
