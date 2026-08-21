public class Factorial_number {
    public static void main(String[] args) {
        int n = 5;
        int mult = 1;

        for (int i = n; i >=1; i--) {
            mult = mult * n;
            n = n - 1;
        }
        System.out.println(mult);
    }
}
