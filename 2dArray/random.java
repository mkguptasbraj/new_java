
public class random {

    public static void main(String[] args) {
        int n = 12345;
        int even = 0;
        int odd = 0;
        // while(n>0){
        //     int ans = n%10;
        //     if(ans%2==0){
        //         even+=ans;
        //     }
        //     else{
        //         odd+=ans;
        //     }
        //     n=n/10;
        // }

        for (; n > 0; n = n / 10) {
            int lastdigit = n % 10;
            if (lastdigit % 2 == 0) {
                even += lastdigit;
            } else {
                odd += lastdigit;
            }
        }

        System.out.println(even);
        System.out.println(odd);
    }

}
