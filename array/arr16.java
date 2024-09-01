import java.util.Scanner;

public class arr16 {



    static int first_repeting_value(int arr[]){
       
        for(int i = 0; i<arr.length;i++){
           for(int j = i+1;j<arr.length; j++){
            if(arr[i]==arr[j]){
             return arr[i];
            }
            
           } 
        }
        return -1;
       
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the number of n");
        int n = sc.nextInt();
        System.out.println("enter the  of array::");
   int []arr = new int [n];
        
        for(int i = 0; i<arr.length;i++){
            arr[i]=  sc.nextInt();
 }
 System.out.println("First repetiting value::" +first_repeting_value(arr));
    }
}
