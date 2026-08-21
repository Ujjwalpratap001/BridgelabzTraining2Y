import java.util.Scanner;
//1. Calculate Simple Interest Write a program to calculate simple interest using the formula: Simple Interest = (Principal * Rate * Time) / 100.
//  Take Principal, Rate, and Time as inputs from the user.

public class simpleinterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of principle --> ");
        int p=sc.nextInt();
        System.out.print("enter the value of rate --> ");
        int r=sc.nextInt();
        System.out.print("enter the value of value --> ");
        int t=sc.nextInt();

        double si=(p*r*t)/100;

        System.out.println("the simple interest is : "+ si);
    }

}