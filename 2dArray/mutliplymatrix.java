import java.util.Scanner;

public class mutliplymatrix {
   static  void multiply(int[][]a ,int r1,int r2, int[][] b,int c1,int c2){
if(c1!=r2){
    System.out.println("multiplication not possible");
    return;
}
int [][] mutiply = new int [r1][c2];
 for(int i = 0;i<r1;i++){
    for(int j= 0; j<c2;j++){
    for(int k = 0; k<c1;k++){
       mutiply[i][j] +=(a[i][k] * b[k][j]);
    }
    }
 }
 System.out.println("multiplication of 2 matrix");
 printArray(mutiply);
   }
   
   
    static void printArray(int[][] arr){
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j] + " ");
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
            // Scanner sc = new Scanner(System.in);
             System.out.println("Enter number of rows");     
             int r2= sc.nextInt();
             System.out.println("Enter number of column");
             int c2= sc.nextInt();
             int [][]b = new int [r2][c2];
             System.out.println("enter " + r2*c2 +"element");
             for (int i = 0; i < r2; i++) {
                 for (int j = 0; j < c2; j++) {
                     b[i][j]=sc.nextInt();
                 }
             }
         
             multiply(a, r1, r2, b, c1, c2);
             sc.close();
 
            }   
}
