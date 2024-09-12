import java.util.Scanner;

public class sum {
     static int sumofnum(int n )
{
    if(n==0){return 0;}
  int subproblem = sumofnum(n-1);
return subproblem + n ;
}
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(sumofnum(n));
          sc.close();
         




    }
}
