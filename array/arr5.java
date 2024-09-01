
import java.util.Scanner;

public class arr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        System.out.println("Enter the number of array " );
        for(int i = 0; i<5;i++){
            arr[i]=sc.nextInt();
           
        }
        for(int j = 0; j<5; j++){
           // arr[1]=sc.nextInt();
            System.out.print(arr[j] + "");
        }




    }
}
