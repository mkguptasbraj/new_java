public class arr3 {
   public static void main(String[] args) {
   int  arr[]={100,5,3,123};
       int sum = 0;
       int ans = 0;

        for(int i = 0;i<4;i++){
            sum = sum +arr[i];
         if(arr[i]> ans){
            ans = arr[i];
           
         }
           // System.out.println(sum);
        }
        System.out.println(sum);
        System.out.println(ans);














   } 
}
