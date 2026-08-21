//5. Volume of a Cylinder Write a program to calculate the volume of a cylinder.
//  Take the radius and height as inputs and 
// use the formula: Volume = π * radius^2 * height.
import java.util.Scanner;
public class volumeofcylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius");
        int r=sc.nextInt();
        System.out.print("enter the height");
        int h=sc.nextInt();
        
        double Volume = 3.14 * r*r * h;
        System.out.println("the volume is : "+Volume);



    }
    
}
