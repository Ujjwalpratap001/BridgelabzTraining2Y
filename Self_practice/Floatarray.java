public class Floatarray {
    public static void main(String[] args) {
        float[] arr = {34.4f,56.7f,45.6f,55.7f};
        float sum=0;
        for (float pratap : arr) {
            sum=sum +pratap;
        }
        System.out.println("the sum is"+ sum);
        System.out.println("the average is"+ sum/arr.length);
    }
}
