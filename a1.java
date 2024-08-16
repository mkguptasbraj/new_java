
import java.util.Scanner;

/**
 * a1
 */
public class a1 {

    public static void main(String[] args) {
        System.out.println("hello");
     double x1 = 90;
     double x2 = 80;
     double x3 = 78;
     double x4 = 75;
     double x5 = 89;
     double percentage= (x1+x2+x3+x4+x5)/5;
     System.out.println(percentage);  
      double randius = 5;
      double area= 3.14 *randius *randius;
      System.out.println(area); 

     
       try (Scanner sc = new Scanner(System.in)) {
        int radius = sc.nextInt();
           double pi = 3.1456;

        double areas = pi*radius*radius;
        System.out.println(areas);
    }





    }
}