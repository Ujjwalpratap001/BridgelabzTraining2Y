//package Assesment3_practice;
import java.util.*;
public class count_vovel_and_consonent {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();
        int vovel=0;
        int consonent=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vovel++;
            }
            else{
                consonent++;
            }
        }
        System.out.println("vovel = "+   vovel);
        System.out.println("consonent = "+consonent);
    }
}
