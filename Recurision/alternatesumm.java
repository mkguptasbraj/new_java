import java.util.Scanner;

public class alternatesumm {
 static int altsum(int  n){
    if(n==0){
        return 0;
        
    }
    if(n%2==0){
        return altsum(n-1) -n;
    }
    return altsum(n-1) +n;

 }


    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
    System.out.println(altsum(n));



}
    }
}
