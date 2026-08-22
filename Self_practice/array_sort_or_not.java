public class array_sort_or_not {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5,6};
        boolean sort=false;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                sort=true;
            }
        }
        if(sort){
            System.out.println("your array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
