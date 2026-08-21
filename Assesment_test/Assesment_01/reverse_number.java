

public class reverse_number {
    public static void main(String[] args) {
        int n=6655;
        int rem=0;
        int pratap=0;

        while(n>0){
            rem=n%10;
            pratap=pratap*10+rem;
            n=n/10;
        }
        System.out.println(pratap);
    }
}
