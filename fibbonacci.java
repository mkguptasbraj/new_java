import java.util.Scanner;

public class fibbonacci {
    static int fib(int n){
        if(n==0){
            return 0;

        }
        if(n==1){
            return 1;
        }
        else{
          //  int prev = fib(n-1);
            // int prevprev =fib(n-2);
         return fib(n-1)+fib(n-2);
         // return prev + prevprev;
    }}
    public static void main(String[] args) {     
           Scanner sc =new Scanner(System.in);
                int n = sc.nextInt();
    System.out.println(fib(n));
      for(int i=0;i<=n;i++){
     System.out.println(fib(i));
 
 sc.close();}
}


}
