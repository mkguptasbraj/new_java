import java.util.Scanner;

public class arr10 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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
       // System.out.println("enter the last occerence");
      //  int last_index = sc.nextInt();
        System.out.println("is sorted : " + isSorted(arr));

        sc.close();
    }
}
