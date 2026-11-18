public class sumofnaturalnumber {
    static int pint(int n){
        if(n==1){
            return 1;   
    }
     else 
       return n + pint(n-1);
     
    
    }
public static void main(String[] args) {
    int n =10;
    System.out.println(pint(n));
}
}
