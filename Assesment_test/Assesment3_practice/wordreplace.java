//package Assesment3_practice;
import java.util.Scanner;
public class wordreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String sentense = sc.nextLine();
        String oldword= sc.nextLine();
        String newword= sc.nextLine();
        String result = sentense.replace(oldword,newword);
        System.out.println(result);
        
    }
}
