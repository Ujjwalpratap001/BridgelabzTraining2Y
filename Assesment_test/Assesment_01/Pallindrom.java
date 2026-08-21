public class Pallindrom {
    public static void main(String[] args) {
        int n=99899;
        int pratap=n;
        int rem =0;
        int result=0;

        while(n>0){
            rem=n%10;
            result =result*10+rem;
            n=n/10;
        }
        if (pratap==result){
            System.out.println("Hurrah ! \nit is a Pallindrom number");
        }
        else{
            System.out.println("not a Pallindrom number");
        }

    }
}
