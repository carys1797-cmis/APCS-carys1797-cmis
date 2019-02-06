
public class LinearSearch
{
    public static int steps = 0;
    public static void main(String[] args){
        int n = 10;
        int[] array = new int[n];
        int v = (int)(Math.random() * n) - (n/2) ;
        for(int i = 0; i < n; i++){
            System.out.println(v);
            array[i] = v;
            if(Math.random() <= 0.5)
                v+= (int)(Math.random() * n);

        }
        int key = Math.random() > 0.5 ? (int)(Math.random() * (array[n-1] - array[0])) + array[0] : array[(int)(Math.random() * array.length)];
        System.out.println("Key: "+key);
        System.out.println("Index: "+search(array, key));
        System.out.println("Steps: " + steps);
    }

    public static int search(int[] array, int n){
        steps += 2;
        int index = -1;
        for(int i = 0; i < array.length; i++){
            steps += 5;
            if (array[i] == n){
                steps += 3;
                index = i;
                i = array.length;
            }
        }
        return index;
    }

}
