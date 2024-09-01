//package twopointer.java;

import java.util.Scanner;
//import java.util.regex.MatchResult;


public class question2 {
    static void reverse (int []arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] sortSquared(int[] arr){
        int n = arr.length;
        int left = 0;  int right = n-1, k= 0;
        int [] ans = new int[n];
        while(left <= right){
            if(Math.abs(arr
            [left])> Math.abs(arr[right])){
                ans[k++]= arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] *arr[right];
                right--;
            }
        } 
        return ans;


    }
    static void sortoddAndEven(int [] arr){
        int n = arr.length ;
        int left = 0, right = n-1;
        while(left < right){
         if(arr[left]%2==1&& arr[right]%2==0){
             swap(arr, left, right);
             left++;
             right--;
         }
         if(arr[left] %2==0  ){
             left++;
         }
         if(arr[right] %2==1)
             right-- ;}
         
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
    public static void main(String[] args) { 
        Scanner  abc= new Scanner(System.in); 
            int n = abc.nextInt();
   int []arr = new int[n];

    
   System.out.println("ENTER " + n+ "elements");
    for (int i = 0; i < n; i++) {
            arr[i]=abc.nextInt();
          
    } 
    printArray(arr);
   int []ans= sortSquared(arr);
 reverse(ans);
  //sortoddAndEven(arr);
    printArray(ans);
   
        











    }}

