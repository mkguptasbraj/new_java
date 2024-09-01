
import java.util.Scanner;

public class arr12 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int [n];
        
        for(int i = 0; i<arr.length;i++){
            arr[i]=  sc.nextInt();
        }
        int pair = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 1;j<arr.length;j++){
                if(arr[i]+arr[j]==8){
                    pair++;
                }
            }
           

            
        }
        System.out.println("total pair :: " +pair);
    
    
    
    
    }
}
