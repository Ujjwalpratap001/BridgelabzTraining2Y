import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("now you are eligible for the voter id ");
                break;
            case 21:
                System.out.println("eligible for post of income tax inspecter ");
                break;
            default:
                System.out.println("thanks for visit out site ");

        }
    }
}