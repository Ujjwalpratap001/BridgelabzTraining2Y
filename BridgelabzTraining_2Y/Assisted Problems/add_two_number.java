//Write a program that takes two numbers as input from the user and prints their sum.


import java.util.Scanner;
public class add_two_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the value :");
        int ujjwal=sc.nextInt();
        System.out.print("enter the value :");
        int pratap=sc.nextInt();

        int singh=ujjwal+pratap;

        System.out.println("the sum is : "+ singh);

        sc.close();
    }
    
}
