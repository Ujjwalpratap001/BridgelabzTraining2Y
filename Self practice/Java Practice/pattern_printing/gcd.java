import java.util.*;
public class gcd {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR FIRST NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER YOUR SECOND NUMBER");
        int b=sc.nextInt();
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD="+a);
    }
    
}
