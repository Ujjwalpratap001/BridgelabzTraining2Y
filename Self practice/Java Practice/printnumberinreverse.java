public class printnumberinreverse {
    static int rev (int n){
       if(n==0){
        return 0;
       }
       System.out.print(n+" ");
       return rev(n-1);
    }
    public static void main(String[] args) {
        rev(10);
    }
}
