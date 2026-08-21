import java.util.Scanner;

public class First_n_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("upto where you want to print the even number");
        int n = sc.nextInt();

        int i = 0;

        while (i <= n) {
            System.out.println(i);
            i = i + 2;
        }

    }
}
