public class Binary
{
    public static void main(String[] args){
        int n = 10;
        int[] array = new int[n];
        int v = (int)(Math.random() * n) - (n/2) ;
        for(int i = 0; i < n; i++){
            System.out.print (v + " ");
            array[i] = v;
            if(Math.random() <= 0.5)
                v+= (int)(Math.random() * n);

        }
        int key = Math.random() > 0.5 ? (int)(Math.random() * (array[n-1] - array[0])) + array[0] : array[(int)(Math.random() * array.length)];
        System.out.println();
        System.out.println("Key: "+key);
        System.out.println("Index: "+search(array, key, false));
    }

    public static int search(int[] array, int value, boolean firstlast){
        int front = 0;
        int back = array.length - 1 ;
        int matchIdx = -1;
        while(front <= back){
            int mid = (front + back) / 2; 
            int middleValue = array[mid];
            if(middleValue == value){
                matchIdx = mid;
                int c = 1;
                if (firstlast){
                    while(array[mid - c] == middleValue && c <= mid){
                        matchIdx = mid - c;
                        c++;
                    }
                    break;
                }else {
                    while(array[mid + c] == middleValue && (c + mid) < array.length){
                        matchIdx = mid + c;
                        c++;
                    }
                    break;
                }
            }else if(value > middleValue){
                front = mid + 1;
            }else if(value < middleValue){
                back = mid - 1;
            }
        }
        return matchIdx;
    }
}