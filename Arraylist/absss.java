import java.util.Scanner;

public class absss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       // int mode = number/10;
        int evensum=0;
        int oddsum = 0;
        while(number>0){
            int mode = number%10;
        if(mode%2==0){
            evensum+=mode;
  }
  else{
    oddsum+=mode;
  }
  number = number/10;

}
 System.out.println(evensum+ " "+ oddsum);
 sc.close();
    }
    
}
