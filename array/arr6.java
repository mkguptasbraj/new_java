
import java.util.Arrays;
import java.util.Scanner;

public class arr6 {

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
       System.out.print(arr[i]+ " ");
   }
   System.out.println();
}
 public static void main(String[] args) {
       Scanner  sc = new Scanner(System.in) ;
        int [] arr = new int [5];

     System.out.println("enter the value of array");
        for(int i = 0; i<5;i++){
            arr[i]=sc.nextInt();

 }
printArray(arr);
int [] arr_2 = Arrays.copyOfRange(arr, 2, 4);
printArray(arr_2);
sc.close();

   } 
}
