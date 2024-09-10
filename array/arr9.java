import java.util.Scanner;

public class arr9 {

    // static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    static int greather_value(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("enter the value of array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            System.out.println("enter the value of x ");
            int x = sc.nextInt();
            System.out.println("Count of x :" + greather_value(arr, x));
            sc.close();
        }
    }
}