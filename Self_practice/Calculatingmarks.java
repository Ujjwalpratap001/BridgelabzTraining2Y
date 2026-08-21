public class Calculatingmarks {
    public static void main(String[] args) {
        // calculating the averagee marks of anarray containing marks
        // of all students in physics usingfor each loop
        int[] arr = { 43, 59, 43, 54, 56 };
        int marks = 0;
        for (int pratap : arr) {
            marks = marks + pratap;
        }
        System.out.println(marks / arr.length);
    }
}
