public class fake {
    public static void main(String[] args) {
       int pratap=1;
       int m=5;
       int n=-3;

       if (n==0){
        System.out.println(1);
       }

       else if (n<0){
        n=-n;
        for(int i=1;i<=n;i++){
        pratap = pratap*m;
        
        
       }
        // System.out.println(double/(1.0/pratap));
        double d= (1.0/pratap);
        System.out.println(1.0/pratap);
       }
       else{
        for(int i=1;i<=n;i++){
        pratap = pratap*m;
        
        
       }
        System.out.println(pratap);
       }

      
    }
}