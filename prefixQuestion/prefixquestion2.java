import java.util.Scanner;
//import static prefix_sum.makePrefixSumArray;

public class prefixquestion2 {
    static int[] make_prefix_sum(int [] arr){
        for(int i = 1;i<arr.length;i++){
            arr[i]= arr[i]+arr[i-1];
        }
        return arr;
    }
    
   public static void main(String[] args) {
       Scanner  abc= new Scanner(System.in); 
            int n = abc.nextInt();
   int []arr = new int[n];

    
   System.out.println("ENTER " + n+ "elements");
    for (int i = 1; i <= n; i++) {
            arr[i]=abc.nextInt();
          
    }
    int []prefix_sum = make_prefix_sum(arr);
    System.out.println("Enter number of queries");
 int q = abc.nextInt();
 while(q-->0){
    System.out.println("Enter range");
    int l = abc.nextInt();
    int r = abc.nextInt();
    int ans = prefix_sum[r]  - prefix_sum[l-1];
     System.out.println("sum " + ans);
    
 }
   } 
}
