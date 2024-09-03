import java.util.Scanner;

public class generateSpiral {
    static int [][] generatesSpiralMatrix(int n){
      
        int [][]matrix = new int[n][n];
        
        int topRow = 0,bottomRow = n-1, leftCol=0,rightCol = n-1;
    int curr = 0;
        while(curr <n *n){
    
    // topRow -> leftcol to rightcol
    for(int j = leftCol;j<=rightCol&&curr <= n *n;j++){
       // System.out.print(matrix[topRow][j]+" ");
       matrix[topRow][j]=curr;
        curr++;
    }
    topRow++;
    //rightCol ->topRow to BottomRow
    for(int i = topRow ; i<=bottomRow &&curr <=n *n;i++){
       // System.out.print(matrix[i][rightCol]+" ");
       matrix[i][rightCol] = curr;
       curr++;
    }
    rightCol--;
    //bottomRow ->rightcol to leftcol\
    
    for(int j = rightCol;j>=leftCol&&curr <= n *n;j--){
       // System.out.print( matrix[bottomRow][j]+" ");
    
       matrix[bottomRow][j]=curr;
          curr++;
    }
    bottomRow--;
     
    //leftcol->bottomrow to topRow
    for(int i = bottomRow; i>=topRow&&curr <= n *n;i--){
        System.out.print(matrix[i][leftCol]+" ");
        matrix[i][leftCol]=curr;
        curr++;
    } leftCol++;
    
}
return  matrix;
    }
    

    static void printArray(int[][] arr){
        for (int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }

}
   public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int [][] matrix = generatesSpiralMatrix(n);
 printArray(matrix);
   } 
}
