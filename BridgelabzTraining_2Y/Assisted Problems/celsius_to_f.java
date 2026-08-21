import java.util.Scanner;
public class celsius_to_f {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the celsius value:");
        int c=sc.nextInt();
        int Fahrenheit = (c * 9/5) + 32;
        System.out.println(Fahrenheit);
    }
}
