import java.util.Scanner;

public class factorial {
  
    static int  Factorial(int n){
        int factorial =1;
        if(n==0){
            System.out.println(1);
        }
    
       int fact = Factorial(n-1);
            int ans = n*fact;
        
        
        return ans;}


    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    System.out.println(Factorial(n));
   
    }
}
