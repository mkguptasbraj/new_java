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
static void transposeInplace(int[][] matrix,int r, int c){
    for(int i = 0;i<c;i++){
        for(int j = i;j<r;j++){
            //swap matrix[i][j] , matrix[j][i]
        int temp = matrix[i][j];
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
        
        
        }
    }
}
static void reverseArray(int[]arr)
{

    int i = 0,j = arr.length-1;
    while(i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
}
static void rotateMatrix(int [][]arr,int r1,int c1){
// transpose
// reverse each row of transposed matrix
transposeInplace(arr, r1, c1);
 for (int i = 0; i <arr.length; i++) {
     reverseArray(arr[i]);
     
 }}
   








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
             printArray(a);
             System.out.println("after the roate");
             rotateMatrix(a, r1, c1);
             printArray(a);
             sc.close();
    }
}
