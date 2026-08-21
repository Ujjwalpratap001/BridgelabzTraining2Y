

public class sum_of_digit {
    public static void main(String[] args) {
        int n=7816;
        int rem=0;
        int sum=0;

        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("the sum is : " + sum);
    }
    
}
