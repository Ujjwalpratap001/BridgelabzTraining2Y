public class question {
   
    public static void main(String[] args) {

        int n = 123;
        int temp = n;

        int sum = 0;
        int product = 1;

        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem;
            product = product * rem;
            temp = temp / 10;
        }

        int result = sum + product;

        System.out.println("Final Result = " + result);
    }

}
