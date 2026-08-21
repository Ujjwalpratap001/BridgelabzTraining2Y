public class Findmaxelement {
    public static void main(String[] args) {
int[] arr= {66,64,333,6,77,888};
int max=arr[0];
for(int i=0;i<arr.length;i++) {
   if (arr[i]>max){
    max= arr[i];
   }
    
}
System.out.println(max);
    }
}
