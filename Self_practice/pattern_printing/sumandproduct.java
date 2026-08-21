public class sumandproduct {
    public static void main(String[] args) {
    int a=333;
    int result=0;
    int rem=0;

    while (a>0){
        rem=a%10;
        result=result +rem;
        a=a/10;

    }
    System.out.println(result);
    }
}
