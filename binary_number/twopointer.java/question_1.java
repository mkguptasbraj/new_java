
import java.util.Scanner;


//import java.lang.reflect.Array;



public class question_1 {
    static void sortZeroAndones(int [] arr){
       int n = arr.length ;
       int left = 0, right = n-1;
       while(left < right){
        if(arr[left]==1 && arr[right]==0){
            swap(arr, left, right);
            left++;
            right--;
        }
        if(arr[left] ==0  ){
            left++;
        }
        if(arr[right] ==1){
            right--;
        }
       }
    }

static void printArray(int[] arr){
    //int n = arr.length;
    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}
static void swap(int[] arr,int i ,int j){
    int temp = arr[i];
    arr[i] =arr[j];
    arr[j] = temp;
}
static void sortZeroesAndones(int[]arr){
    int n = arr.length;
    int Zerows = 0;
    for (int i = 0;i<n;i++) {
        if(arr[i]==0){
            Zerows++;
        }

    }
    for (int i= 0; i < arr.length; i++) { 
        if(i< Zerows){
            arr[i]=0;
 }
 else{
    arr[i]=1;
 }
       
        
    }}


    public static void main(String[] args) {
        try (Scanner  abc= new Scanner(System.in)) {
            int n = abc.nextInt();
   int []arr = new int[n];
    
   System.out.println("ENTER " + n+ "elements");
    for (int i = 0; i < n; i++) {
            arr[i]=abc.nextInt();
    }   
     System.out.println("original array :");
     printArray(arr);
     //sortZeroesAndones(arr);
     //System.out.println("sorted Array :");
      sortZeroAndones(arr);
     printArray(arr);
        }
    }
}
