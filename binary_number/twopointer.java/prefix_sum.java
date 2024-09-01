import java.util.Scanner;

public class prefix_sum {

    static void printArray(int[] arr){
        //int n = arr.length;
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int [] makePrefixSumArray(int[]arr){
    
        //int [] pref = new int[n];
        //pref[0]=arr[0];
       // for(int i = 1;i<n;i++){
         //   pref[i] = pref[i-1]+ arr[i];
            
        //}
       // return pref;
       for(int i = 1; i<arr.length ; i++){
        arr[i]= arr[i-1]+arr[i];

       }
       return arr;

    }
     
    public static void main(String[] args) {
          Scanner  abc= new Scanner(System.in); 
            int n = abc.nextInt();
   int []arr = new int[n];

    
   System.out.println("ENTER " + n + "elements");
    for (int i = 0; i <n; i++) {
            arr[i]=abc.nextInt();
          
    } 

printArray(arr);
int []ans = makePrefixSumArray(arr);
printArray(ans);

 }
    }

