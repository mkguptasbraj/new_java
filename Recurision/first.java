import java.util.Scanner;

public class first {
      static void printDecersing(int n ){
        // basecase
        if(n==1){
            System.out.println(n);
        }
        else{
            //self work
            System.out.println(n);
            //recursion work
            printDecersing(n-1);
        }
      } 
    static void printIncreasing(int n) {
      //  if (n < 1) {
          //  return; // base case: if n is less than 1, stop
      //  }
        if (n == 1) {
            System.out.println(n);
        } else {
          //  System.out.println(n);
            printIncreasing(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
        printDecersing(n);
    }
}