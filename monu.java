
import java.util.Scanner;

/**
 * monu
 */
public class monu {
public static void main(String[] args) {
    System.out.println("hello world");

Scanner sc = new Scanner(System.in);
System.out.println("enter the number ");
int  n = sc.nextInt();
    /*if (n%2==0) {
    System.out.println("even number");
    }
    else{
        System.out.println("odd number");
    }*/
if(n%5==0){
    System.out.println("enter number is divisible by 5");
    }
    else{
        System.out.println("enter number is not divisible  by 5 ");
}
/* 

int year = sc.nextInt();
if(year%4==0 && year%400 ==0){
    System.out.println("year is leap ");
}
else{
    System.out.println("non leap year");
} */
int integer =sc.nextInt();
if(integer<0){
     integer = integer*(-1);
     System.out.println( "the abousulate value integer   "  + integer );
}else{
System.out.println("the absoulate value is : " + integer);
}












}
}
