

public class count_digit {
    public static void main(String[] args) {
        int n=7251;
        int rem =0;
        int c=0;

        while(n>0){
            rem=n%10;
            c++;
            n=n/10;
        }
        System.out.println("The number of digit is: "+ c);
       
    }
}
