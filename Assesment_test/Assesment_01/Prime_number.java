//package Assesment_01;

public class Prime_number {

   public static void main(String[] args) {
     int n=11;

    boolean pratap =true;

    if(n<2){
        pratap=false;
    }
    else{
        for(int i=2;i<n;i++) {
            if(n%i==0){
                pratap=false;
            }
        }
    }

    if(pratap==true){
        System.out.println("it is a prime number");
    }
    else{
        System.out.println("not a prime number ");
    }

   }
}
