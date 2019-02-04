
public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.SORTED; //SORTED, RANDOM, or REVERSED
        int n = 100;
        int[] array = Util.getArray(n, at);
        int[] tmp = new int[array.length];
        long totaltime = 0;
        for(int i = 0; i < array.length; i++){
            tmp[i] = array[i];
        }
        long start, stop, btime, itime, stime, mtime;
        System.out.format("%d Unsorted Integers\n", n);

        Util.print(array);

        for(int i = 0; i < 10; i++){
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            totaltime += btime;
            System.out.println(btime);
        }
        totaltime /= 10;
        
        for(int i = 0; i < array.length; i++){
            array[i] = tmp[i];
        }

        start = System.nanoTime();
        SelectionSort.sort(array);
        stime = System.nanoTime() - start;

        for(int i = 0; i < array.length; i++){
            array[i] = tmp[i];
        }

        start = System.nanoTime();
        InsertionSort.sort(array);
        itime = System.nanoTime() - start;

        for(int i = 0; i < array.length; i++){
            array[i] = tmp[i];
        }

        start = System.nanoTime();
        MergeSort.sort(array);
        mtime = System.nanoTime() - start;

        System.out.println("SORTED");
        Util.print(array);

        for(int i = 0; i < array.length; i++){
            array[i] = tmp[i];
        }

        System.out.format(
            "BubbleSort: %d %d\n"+
            "SelectionSort: %d %d\n"+
            "InsertionSort: %d %d\n"+
            "MergeSort: %d %d\n", 
            totaltime, BubbleSort.steps, stime, SelectionSort.steps,  itime, InsertionSort.steps, mtime, MergeSort.steps);
    }
}

