public class arr17 {
    static void swapWithouthoutTemp(int a , int b){
    System.out.println("original values before  swap");
    System.out.println("a: "+a);
    System.out.println("b : " + b);
    a = a+b;
    b = a-b;
    a = a-b;


    System.out.println(" values after swap");
    System.out.println("a: "+a );
    System.out.println("b : " + b);
}



static void swap(int a, int b){
  System.out.println("original values before  swap");
  System.out.println("a: "+a);
  System.out.println("b : " + b);

  int temp = a;
    a = b;
    b = temp;

    System.out.println(" values after swap");
    System.out.println("a: "+a);
    System.out.println("b : " + b);
  
 }


    public static void main(String[] args) {
        int a= 9;
        int b = 3;
        int[]arr={1,2,3,4,5};
       // swap(9, 3);
       swapWithouthoutTemp(a, b);

    }
}
