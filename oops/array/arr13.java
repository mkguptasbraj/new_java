import java.util.Scanner;

public class arr13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int [n];
        
        for(int i = 0; i<arr.length;i++){
            arr[i]=  sc.nextInt();
 }
 int ans = 0;
for(int i = 0 ; i<arr.length;i++){
    for(int j =i + 1;j<arr.length;j++){
        for(int k = j+1;k<arr.length;k++){
            if(arr[i]+arr[j]+arr[k]==12){
                ans++;
              System.out.println("the number whose sum is 12 " +arr[i]+arr[j]+arr[k]);
  
            }
        }
    }
}

System.out.println  ( "total pair " +ans);


    }
}
