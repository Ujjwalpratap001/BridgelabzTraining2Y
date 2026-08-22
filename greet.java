import java.util.Scanner;

public class greet{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Your Name: ");
        String name= sc.nextLine();

        System.out.println("Hello " +name +"\nWelcome To Pratap pvt.ltd");
    }
}