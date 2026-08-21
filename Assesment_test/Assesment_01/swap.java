public class swap {
   public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6,7};
     int n=3;
     int last=0;
 
     for (int i=0;i<n;i++){
         last=arr[n-1];

        for(int j=n-1;j>0;j--){
            arr[j]=arr[j-1];

        }
        arr[0]=last;
     }
     System.out.println(arr);
   }

}
