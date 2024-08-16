import java.util.Scanner;

public class a4 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int cost_price = sc.nextInt();
       int selling_price = sc.nextInt();

       if(selling_price > cost_price){
        int profit = selling_price - cost_price;
        System.out.println("get the profitable");
        System.out.println("you have to profit of " + profit +"rupees");
       }
       else{
        int loss = cost_price-selling_price;
        System.out.println("get the lossable    " + loss);
       }
       


















   } 
}
