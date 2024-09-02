import java.util.Scanner;

public class rotatematrix90 {
    static void printArray(int[][] arr){
        for (int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
}










    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
             System.out.println("Enter number of rows");     
             int r1= sc.nextInt();
             System.out.println("Enter number of column");
             int c1= sc.nextInt();
             int [][]a = new int [r1][c1];
             System.out.println("enter " + r1 *c1 +"element");
             for (int i = 0; i < r1; i++) {
                 for (int j = 0; j < c1; j++) {
                     a[i][j]=sc.nextInt();
                 }
             }
    }
}
