import java.util.*;
public class frequency_of_every_charactor{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str=sc.nextLine();

    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);

        boolean check = false;

        for(int j=0;j<i;j++){
            if(str.charAt(j)==ch){
                check=true;
                break;
            }
        }
        if(!check){
            int count=0;

            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            System.out.println(ch +" occur"+count +" times");
        }
    }
}
}