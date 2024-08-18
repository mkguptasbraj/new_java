import java.util.Scanner;

public class a10 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum_of_digit = 0;
     while (n>0) {
        sum_of_digit+=n%10;
       n=n/10;
     }
System.out.println("sum of digit " + sum_of_digit);
 }   
}
