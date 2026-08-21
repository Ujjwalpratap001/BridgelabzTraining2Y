public class Printingarrayinreverse {
    public static void main(String[] args) {
        int[] pratap = { 2, 5, 3, 6, 7 };

        // printing the array
        System.out.print("{ ");
        for (int i = 0; i < pratap.length; i++) {
            System.out.print(" " + pratap[i] + ",");
        }
        System.out.println("}");

        // printing the reverse array

        System.out.print("{ ");
        for (int i = pratap.length-1; i >= 0; i--) {
            System.out.print(pratap[i]+" ,");
        }
         System.out.println("}");
    }

}
