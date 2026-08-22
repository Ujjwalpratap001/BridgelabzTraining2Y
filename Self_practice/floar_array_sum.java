import java.util.Scanner;
public class floar_array_sum {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);   
    
    float arr[]= new float[5];

    for (int i=0;i<arr.length;i++){
        arr[i]=sc.nextFloat();
    }

    float sum=0;
    for (int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    float average=sum/arr.length;
    System.out.println("sum is "+sum);
    System.out.println("average is " +average);

}
}
