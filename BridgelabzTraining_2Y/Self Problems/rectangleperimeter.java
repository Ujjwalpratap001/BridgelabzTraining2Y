//package Self Problems;
//2. Perimeter of a Rectangle Write a program to calculate the perimeter of a rectangle.
//  Take the length and width as inputs and use
//  the formula: Perimeter = 2 * (length + width).
import java.util.Scanner;
public class rectangleperimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("length -- ");
        int l=sc.nextInt();
        System.out.print("width -- ");
        int w=sc.nextInt();

        int p=2*(l+w);
        System.out.println(
            "the perimeter is : "+p
        );
    }
    
}
