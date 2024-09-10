
import java.util.Scanner;

public class arr8 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int lastoccerance(int[] arr, int x) {
        int last_index = -1;
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] == x) {
                last_index = i;
            }
        }
      
        return last_index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("enter the value of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println("enter the last occerence");
        int last_index = sc.nextInt();
        System.out.println("last occerence" + lastoccerance(arr, last_index));
        sc.close();
    }
}
