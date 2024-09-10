
import java.util.Scanner;

public class reveserTheMatrix {

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int [][] reseveMatrix(int[][]arr,int c1,int r1){
        int [][] ans = new int[r1][c1];
        for (int i = 0; i<r1;i++){
            for(int j =0;j<c1;j++){
                ans [i][j] = arr[j][i];
            }
        } 
        return ans;
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

  



public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r1 = sc.nextInt();
        System.out.println("Enter number of column");
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        System.out.println("enter " + r1 * c1 + "element");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
      
       System.out.println("transpose the matrix");
      //int [][] ans = reseveMatrix(arr, c1, r1);
      transposeInplace(arr, r1, c1);  
      
      printArray(arr);
      
      

      



    }
}
