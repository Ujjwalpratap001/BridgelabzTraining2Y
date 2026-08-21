public class gcd {
    
public static void main(String[] args) {
    int a=12;
    int b =24;
    int hcf=1;
    
    for(int i=1;i<=a && i<=b;i++) {
        if(a%i==0 && b%i==0){
            hcf=i;
        }
    }
    System.out.println(hcf);
}
    
}
