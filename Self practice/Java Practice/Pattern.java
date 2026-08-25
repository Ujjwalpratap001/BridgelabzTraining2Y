public class Pattern {
    public static void main(String[] args) {
        /*
         printing pattern

         ****
         ***
         ** 
         *
         * 
                                               */

        for (int i = 0; i < 4; i++) {
            for (int j = 4-i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
