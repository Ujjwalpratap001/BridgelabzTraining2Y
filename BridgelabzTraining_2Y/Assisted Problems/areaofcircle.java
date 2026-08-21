//4. Area of a Circle
//  Write a program to calculate the area of a circle. 
// Take the radius as input and use the formula: Area = π * radius^2.

import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.print("enter the value fo radius : ");
        int r=sc.nextInt();
        double area = 3.14 * Math.pow(r,2);
        System.out.println("the area is : "+ area);


    }
}
