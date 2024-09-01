public class arr2 {
    public static void main(String[] args) {
        //int [] ages = new int [10];
        int [] ages = {10,20,30,40,50,60};
           // int [][] number= new int[2][5];
            int [][]multiarray = {{1,2,3,4,5},{6,8,9,12,21}};
            System.out.println(multiarray[1][4]); 


            //first method 
        for(int i = 0; i<6;i++){
   System.out.println(ages[i]);}
// second method
for (   int age : ages) {
    System.out.println(age);
}

//third method
int i = 0;
while(i<6){
    System.out.println(ages[i]);
    i++;
}
















    }
}
