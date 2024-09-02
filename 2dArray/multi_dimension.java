//package 2dArray;

import java.util.Scanner;

public class multi_dimension {
    //int [][] arr = new int[2][3];
    //int [][] arr2={{1,2,3,4},{5,6,7,8},{9,1,2,3}};
    static void printArray(int[][] arr){
        for (int i = 0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
}
        
    
    public static void main(String[] args) {
            // int [][] arr2={{1,2,3,4},{5,6,7,8},{9,1,2,3}};
                  //   printArray(arr2);
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter number of rows");     
             int r= sc.nextInt();
             System.out.println("Enter number of column");
             int c= sc.nextInt();
             int [][]arr = new int [r][c];
             System.out.println("enter " + r *c +"element");
             for (int i = 0; i < r; i++) {
                 for (int j = 0; j < c; j++) {
                     arr[i][j]=sc.nextInt();
                 }
             }
             printArray(arr);
    }
}
