import java.util.Scanner;

public class spiralMatrix {

static void printSpiralOrder(int[][] matrix,int r,int c){
    int topRow = 0,bottomRow = r-1, leftCol=0,rightCol = c-1;
int totalElement = 0;
    while(totalElement < r*c){

// topRow -> leftcol to rightcol
for(int j = leftCol;j<=rightCol&&totalElement < r*c;j++){
    System.out.print(matrix[topRow][j]+" ");
    totalElement++;
}
topRow++;
//rightCol ->topRow to BottomRow
for(int i = topRow ; i<=bottomRow &&totalElement < r*c;i++){
    System.out.print(matrix[i][rightCol]+" ");
totalElement++;
}
rightCol--;
//bottomRow ->rightcol to leftcol\

for(int j = rightCol;j>=leftCol&&totalElement < r*c;j--){
    System.out.print( matrix[bottomRow][j]+" ");
totalElement++;
}
bottomRow--;
 
//leftcol->bottomrow to topRow
for(int i = bottomRow; i>=topRow&&totalElement < r*c;i--){
    System.out.print(matrix[i][leftCol]+" ");
totalElement++;
} leftCol++;


}
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
          System.out.println("SpiralOrder");
        printSpiralOrder(a, r1, c1);
    }
}
