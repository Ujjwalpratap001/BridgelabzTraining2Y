/* public class reverse_a_number {
    static int revnum(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print(n % 10);
            return revnum(n / 10);
        }
    }

    public static void main(String[] args) {
        revnum(345);
    }
}                 */




    public class reverse_a_number{
        static int revnum(int n , int u){
            if(n==0){
                return u;
            }
            else{
                int r = n%10;
                u=u*10 + r ;
                n = n/10;
            }
            return revnum(n,u);
        }
        public static void main(String[] args) {
            System.out.println(revnum(3456, 0));
        }
    }