import java.util.Scanner;

public class arr15 {


    static int find_max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                 max = arr[i];
            }
        }
        return max;
    }
    static int second_largest(int arr[]){
        int mx = find_max(arr);
        for(int i = 0; i<arr.length;i++){
           if(arr[i]==mx) {
            arr[i]= Integer.MIN_VALUE;
           }
        }
        int second_largest=find_max(arr);
        return second_largest;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
   int []arr = new int [n];
        
        for(int i = 0; i<arr.length;i++){
            arr[i]=  sc.nextInt();
 }

 System.out.println("First max value ::"+find_max(arr));
 System.out.println("second max value::"+second_largest(arr));
   
 sc.close();}
}
