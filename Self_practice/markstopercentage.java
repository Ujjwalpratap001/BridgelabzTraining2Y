import java.util.Scanner;

 public class markstopercentage{
    public static void main(String []args ) {
        Scanner sc = new Scanner(System.in);
     System.out.println("your marks is out of ");
     int a=sc.nextInt();
     System.out.println("how many subject do you  have ? ");
     int b = sc.nextInt();
     
     int sum=0;
     for(int i=0;i<b;i++) {
        System.out.println("subject "+ (i+1) +"marks ");
          int c = sc.nextInt();
         sum=sum+c;
     }
     
     System.out.println("your total marks -->"+sum);
     double percentage= (double)sum*100/(a*b);
     
     System.out.println("total percentage --> "+ percentage +"%");

     if(percentage>35) {
        System.out.println("congratulations ! you are passed");
        if(percentage>60) {
            System.out.println("you score great marks");
        }
        else if(percentage>80) {
            System.out.println("you are intelligent");
        }
        else if (percentage>90 ) {
            System.out.println("you are topper ");
        }
        else {System.out.println("you are failed ");}
    }

}
 