
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arr11 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void smallestAndlargerstsortarray(int []arr){
      Arrays.sort(arr);
      for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
      }
    }
    static boolean  isSorted(int []arr){
        boolean check= false;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<arr[i+1]){
                check = true;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("enter the value of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        smallestAndlargerstsortarray(arr); 
        printArray(arr);
    }
}
