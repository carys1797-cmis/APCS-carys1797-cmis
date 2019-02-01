public class MergeSort
{
    public static int steps = 0;
    public static void main(String[] args){

    }
    
    public static int[] sort(int[] array){
        //BASE CASE
        steps += 2;
        if(array.length <= 1){
            return array;
        }
        steps += 10;
        //SPLIT STEP
        int half = array.length / 2;
        int[] front = new int[half];
        int[] back = new int[array.length - half];
        for(int i = 0; i < array.length; i++){
            steps += 4;
            if(i < half){
                steps += 3;
                front[i] = array[i];
            }else{
                steps += 3;
                back[i - half] = array[i];
            }
        }

        //MERGESORT STEP
        front  = sort(front);
        back = sort(back);
        
        //MERGE STEP
        steps += 3;
        int fi = 0;
        int bi = 0;
        for(int i = 0; i < array.length; i++){
            steps += 10;
            if((bi >= back.length) || (fi < front.length  &&  front[fi] < back[bi])){
                steps += 4;
                array[i] = front[fi];
                fi++;
            }else{
                steps += 4;
                array[i] = back[bi];
                bi++;
            }
        }
        
        return array;
    }

}
