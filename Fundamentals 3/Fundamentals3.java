
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

        sprint(locate(strlit));
        iprint(replace(intlit, 10, 0));
        dprint(shift(doblit, 3));
        dprint(tilt(doblit));
        
        greatsum(intlit);
        
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
        iprint(arr);
    }

    public static void setValue(double[][] arr, int r, int c, double v){
        arr[r][c] = v;
        dprint(arr);
    }

    public static void setValue(String[][] arr, int r, int c, String v){
        arr[r][c] = v;
        sprint(arr);
    }

    public static void print2DArray(int[][] array, boolean rowMajor){
        if (rowMajor == true){
            for (int y = 0; y < array.length; y++){
                for (int x = 0; x < array[0].length; x++){
                    System.out.print(array[y][x] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }else if (rowMajor == false){
            for (int y = 0; y < array.length; y++){
                for (int x = 0; x < array[0].length; x++){
                    System.out.print(array[x][y] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void snakePrint(int[][] arr){
        for (int y = 0; y < arr.length; y++){
            for (int x = 0; x < arr[0].length; x++){
                System.out.print(arr[y][x] + " ");
            }
        }
        System.out.println();
    }

    public static String[][] locate(String[][] arr){
        int yrange = arr.length;
        int xrange = arr[0].length;
        int ry;
        int rx;
        do{
            ry = (int) (Math.random() * yrange);
            rx = (int) (Math.random() * xrange);
        }while (arr[ry][rx] != "#");
        if (arr[ry][rx] == "#"){
            int v = (int) (Math.random() * 9) + 1;
            String sv = "" + v;
            arr[ry][rx] = sv;
        }
        return arr;
    }

    public static int[][] replace(int[][] array, int threshold, int newValue){
        for (int y = 0; y < array.length; y++){
            for (int x = 0; x < array[0].length; x++){
                if (array[y][x] > threshold){
                    array[y][x] = newValue;
                }
            }
        }
        return array;
    }

    public static double[][] shift(double[][] arr, int row){
        int yl = arr.length;
        int xl = arr[0].length;
        double[][] out = new double[yl][xl];
        double r;
        for (int y = 0; y < row; y++){
            out[y] = arr[y+1];
        }
        for (int x = 0; x < xl; x++){
            r = Math.random() * 10;
            out[row][x] = r;
        }
        if (row < yl){
            for (int y = row + 1; y < yl; y++){
                out[y] = arr[y];
            }
        }
        return out;
    }
    
    public static double[][] tilt(double[][] arr){
        double[][] out = new double[arr[0].length][arr.length];
        for (int y = 0; y < arr[0].length; y++){
            for (int x = 0; x < arr.length; x++){
                out[y][x] = arr[x][y];
            }
        }
        return out;
    }
    
    public static void greatsum(int array[][]){
        int h = array.length;
        int w = array[0].length;
        int greatest = 0;
        int sum;
        String rc = "";
        int n = 0;
        for (int r = 0; r < h; r++){
            sum = 0;
            for (int c = 0; c < w; c++){
                sum += array[r][c];
            }
            if (sum > greatest){
                greatest = sum;
                rc = "on row ";
                n = r;
            }
        }
        for (int c = 0; c < w; c++){
            sum = 0;
            for (int r = 0; r < h; r++){
                sum += array[r][c];
            }
            if (sum > greatest){
                greatest = sum;
                rc = "in column ";
                n = c;
            }
        }
        System.out.println("The greatest sum is " + rc + n + ": " + greatest);
    }
}
