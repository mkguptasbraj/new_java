import java.util.Scanner;

public class array22 {



static void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i] + " "); 
    }
    System.out.println( );
    }
static int[] rotateThearray (int [] arr,int k)
{ int n = arr.length;
    k = k%n;
    int [] ans = new int [n];
     int j = 0;
     for(int i =n-k;i<n;i++){
        ans[j++] = arr[i];
     }
     for(int i = 0; i<n;i++){
        ans[j++]=arr[i];
     }

     return ans;

}


    public static void main(String[] args) {
        int [] arr ={11,22,33,44,55,66};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k :");
        int k = sc.nextInt();
        System.out.println("before the array without the swap");
    printArray(arr);
    System.out.println("Array after the swap");
    int [] ans = rotateThearray(arr, k);

    printArray(ans);
    sc.close();
    }
}
