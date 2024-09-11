public class count {

    static int countThedigit(int n){
        //base case
        if(n/10==0){return 1;}
     
      return 1 + countThedigit(n/10);
    
  
     
 

 
    }
    public static void main(String[] args) {
        System.out.println(countThedigit(12345));
    }
}
