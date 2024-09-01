public class arr20 {

    static void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i] + " "); 
    }
    System.out.println( );
    }

    static void swapInArray(int[] arr , int i , int j)
    
{
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j] =temp; 

    }
    static  void reverseArray(int[]arr){
        int i = 0; int j=arr.length -1;



        while( i < j){
 swapInArray(arr, i, j);
 i++;
 j--;

    }
    }
    






    public static void main(String[] args) {
        int [] arr ={11,22,33,44,55,66};

         reverseArray(arr);
            printArray(arr);
         

    }
}
