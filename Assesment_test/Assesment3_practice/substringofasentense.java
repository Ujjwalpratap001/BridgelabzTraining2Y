//package Assesment3_practice;
import java.util.Scanner;
public class substringofasentense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentense = sc.nextLine();
        int start=sc.nextInt();
        int end = sc.nextInt();
        String result = sentense.substring(start,end);
        System.out.println(result);
    }
    
}
