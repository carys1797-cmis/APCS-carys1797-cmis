
public class Fundamentals3
{
   public static void iprint(int[][] array){
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[0].length; x++){
                System.out.print(array[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
   }
   public static void dprint(double[][] array){
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[0].length; x++){
                System.out.print(array[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
   }
   public static void sprint(String[][] array){
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[0].length; x++){
                System.out.print(array[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
   
   public static void main(String args[]){
       int[][] intdef = new int[5][5];
       int[][] intlit = {{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}};
       double[][] dobdef = new double[5][5];
       double[][] doblit = {{1.1, 1.2, 1.3, 1.4, 1.5},
                            {2.1, 2.2, 2.3, 2.4, 2.5},
                            {3.1, 3.2, 3.3, 3.4, 3.5},
                            {4.1, 4.2, 4.3, 4.4, 4.5},
                            {5.1, 5.2, 5.3, 5.4, 5.5}};
       String[][] strlit = {{"#", " ", "#", " ", "#", " ", "#", " "},
                            {" ", "#", " ", "#", " ", "#", " ", "#"},
                            {"#", " ", "#", " ", "#", " ", "#", " "},
                            {" ", "#", " ", "#", " ", "#", " ", "#"},
                            {"#", " ", "#", " ", "#", " ", "#", " "},
                            {" ", "#", " ", "#", " ", "#", " ", "#"},
                            {"#", " ", "#", " ", "#", " ", "#", " "},
                            {" ", "#", " ", "#", " ", "#", " ", "#"}};
       iprint(intdef);
       iprint(intlit);
       dprint(dobdef);
       dprint(doblit);
       sprint(strlit);
       
       
   }
   
   public static int find(int[][] array, int row, int column){
       return array[row][column];
   }
   
   public static double find(double[][] array, int row, int column){
       return array[row][column];
   }
   
   public static String find(String[][] array, int row, int column){
       return array[row][column];
   }
   
   public static void setValue(int[][] arr, int r, int c, int v){
       arr[r][c] = v;
   }
   
   public static void setValue(double[][] arr, int r, int c, double v){
       arr[r][c] = v;
   }
   
   public static void setValue(String[][] arr, int r, int c, String v){
       arr[r][c] = v;
   }
}
