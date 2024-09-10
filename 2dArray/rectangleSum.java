import java.util.Scanner;

public class rectangleSum {
static int FindSum1(int [][]matrix,int l1,int r1,int l2,int r2){
    int sum = 0;
  for(int i = l1;i<=l2;i++){
    for(int j = r1; j<=r2;j++){
        sum +=matrix[i][j];
    }
  }
    return sum;
}
static void findPrefixSumMatrix(int [][]matrix){
    int r = matrix.length;
    int c = matrix[0].length;
    // traverse horizontally to calculate to row -wise prefix sum
    for(int i = 0;i<r;i++){
for (int j = 0;j<c;j++){
   matrix[i][j]+=matrix[i][j-1];
} 
    

    }
}
static int FindSum2(int [][]matrix,int l1,int r1,int l2 ,int r2){
    int sum = 0;
    findPrefixSumMatrix(matrix);
for(int i =l1;i<=l2;i++){
    // r1 to r2 sum for row i
    if(r1>=1){
        sum+=matrix[i][r2] - matrix[i][r1-1];}
        else {
        sum +=matrix[i][r2];}
    
}


    return sum;
}

static void printArray(int[][] arr){
    for (int i = 0;i<arr.length;i++) {
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println( );
    }}

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
             System.out.println("Enter number of rows");     
             int r= sc.nextInt();
             System.out.println("Enter number of column");
             int c= sc.nextInt();
             int [][]a = new int [r][c];
             System.out.println("enter " + r *c +"element");
             for (int i = 0; i < r; i++) {
                 for (int j = 0; j < c; j++) {
                     a[i][j]=sc.nextInt();
                 }
             }
             printArray(a);
             System.out.println("Enter rectangle boundaries l1,l2,r,r2");
             int l1 = sc.nextInt();
             int r1= sc.nextInt();
             int l2 = sc.nextInt();
             int r2 = sc.nextInt();
           // System.out.println("Rectangle Sum "+ FindSum1(a, l1, r1, l2, r2));
         
           System.out.println("Rectangle Sum "+ FindSum2(a, l1, r1, l2, r2));
       sc.close();
    
        } 
}
