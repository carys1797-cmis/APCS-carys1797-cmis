public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.RANDOM; //SORTED, RANDOM, or REVERSED
        int n = 10;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        long totaltime = 0;
        System.out.println("UNSORTED");
        Util.print(array);

        //for(double i = 0; i < 10; i++){
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            //totaltime += btime;
            array = tmp;
            //System.out.println(btime);
        //}

        
        start = System.nanoTime();
        SelectionSort.sort(array);
        stime = System.nanoTime() - start;
        array = tmp;

        start = System.nanoTime();
        InsertionSort.sort(array);
        itime = System.nanoTime() - start;
        array = tmp;

        start = System.nanoTime();
        MergeSort.sort(array);
        mtime = System.nanoTime() - start;

        System.out.println("SORTED");
        Util.print(array);


        System.out.format(
            "BubbleSort: %d %d\n"+
            "SelectionSort: %d %d\n"+
            "InsertionSort: %d %d\n"+
            "MergeSort: %d %d\n", 
            btime, BubbleSort.steps, stime, SelectionSort.steps,  itime, InsertionSort.steps, mtime, MergeSort.steps);
    }
}
