
import java.util.Scanner;

public class a13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          int n = sc.nextInt();
          int factorial= 1;

   for(int i =1;i<=n;i++){
   
    factorial = factorial*i;
    // System.out.println(factorial);
 
   System.out.println(factorial);





   }
        }    
    }
}
