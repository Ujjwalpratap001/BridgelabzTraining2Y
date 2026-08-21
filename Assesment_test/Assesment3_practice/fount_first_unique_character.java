//package Assesment3_practice;
import java.util.Scanner;

public class fount_first_unique_character {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();

        int[] arr = new int[300];

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
         boolean found=false;
        for(int i=0;i<str.length();i++){
           
            if(arr[str.charAt(i)]==1) {
                System.out.println(str.charAt(i));
                found=true;
                break;
            }

        }
        if(! found){
            System.out.println("not found");
        }
    }
}
