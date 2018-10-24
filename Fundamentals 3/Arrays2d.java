
public class Arrays2d
{
    public static int[][] numbers(){
        int[][] nums = new int[10][10];
        int i = 1;
        for (int y = 0; y < nums.length; y++){
            for (int x = 0; x < nums[0].length; x++){
                nums[y][x] = i;
                i++;
            }
        }
        return nums;
    }
    
    public static void print(int[][] array){
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[0].length; x++){
                System.out.print(array[y][x] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        print(numbers());
    }
}
