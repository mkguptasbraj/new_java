public class sumofdigit {
    static int sumOfDigit(int n){
 //base case
 if(n>=0 && n<=9){
    return n;
 }
 // recursive work ->small ans

int smallAns = sumOfDigit(n/10);
//self work
int ans = smallAns + n%10;
return ans;
    }
    
    
    public static void main(String[] args) {
     System.out.println(sumOfDigit(123431));   
    }
}
