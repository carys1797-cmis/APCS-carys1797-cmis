
public class LinearSearch
{
    public static void main(String args[]){
        int[] array = getArray(10, true);
        print(array);
        System.out.println(search(array, 3));
    }

    public static int search(int[] array, int n){
        int index = -1;
        for(int i = 0; i < array.length; i++){
            if (array[i] == n){
                index = i;
                i = array.length;
            }
        }
        return index;
    }

    public static int[] getArray(int w, boolean random){
        int[] array = new int[w];
        int ct = 0;
        for(int i = 0; i < w; i++){
            if(random)
                array[i] = (int)(Math.random() * 20) * (Math.random() > 0.4 ? -1 : 1);
            else
                array[i] = ct++;
        }
        return array;
    }

    public static void print(int[] array){
        String out = "{";
        for(int i = 0; i < array.length; i++){
            out += array[i];
            if( i != array.length -1)
                out+=", ";
        }
        out+= "}\n";
        System.out.println(out);
    }
}
