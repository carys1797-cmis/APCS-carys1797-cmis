public class SelectionSort
{
    public static int steps = 0;
    public static void main(String[] args){
    }

    public static int[] sort(int[] array){
        steps += 10;
        int smallestIdx = 0;
        int temp;
        for(int s = 0; s < array.length; s++){
            steps += 4;
            smallestIdx = s;
            for(int n = s; n < array.length; n++){
                steps += 5;
                if(array[n] < array[smallestIdx]){
                    steps++;
                    smallestIdx = n;
                }
            }
            temp = array[smallestIdx];
            array[smallestIdx] = array[s];
            array[s] = temp;
        }
        return array;
    }
}