public class max_element {
    public static void main(String[] args) {
        int arr[]= {5,404,3,22,55,56};
        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
            max=arr[i];
          }
          else{
            max=max;
          }
        }
        System.out.println(max);
    }
}
