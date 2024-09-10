//package Arraylist;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;




public class reverseTheARRAYusingAraylist {
static void reverseList(ArrayList<Integer>List){
    int i = 0 , j =List.size() - 1;
    while(i<j){
        /*
         int temp = a;
         a = b;
         b = temp;
         */
       Integer temp= Integer.valueOf(List.get(i));
       List.set(i,List.get(j));
       List.set(j, temp);
       i++;
       j--;

    }
}

    
  public static void main(String[] args) {
     Integer in = Integer.valueOf(4);
        System.out.println(in);
    ArrayList<Integer>l1 = new ArrayList<Integer>();
   l1.add(5);
   l1.add(6);
   l1.add(7);
   l1.add(8);
   //printing the array list directly
    System.out.println(l1);//[5,6,7,8]
    System.out.println("original List " + l1);
    reverseList(l1);
    System.out.println("reverse List " + l1 );
Collections.reverse(l1);
System.out.println(l1);
Collections.sort(l1);
System.out.println("Ascending order " + l1);
Collections.sort(l1,Collections.reverseOrder());
System.out.println("Desc order " + l1);

ArrayList<String>l2 = new ArrayList();
l2.add("Welcome");
l2.add("To");
l2.add("Physics");
l2.add("Wala");
System.out.println("OL"+l2);
Collections.sort(l2);
System.out.println("sorted"+l2);


}  
}
