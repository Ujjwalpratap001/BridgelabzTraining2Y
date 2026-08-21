public class Add2matrix {
    public static void main(String[] args) {
      int [][] arr = { {4,6,5},
                       {6,4,5}
                               };
        int sum=0;
         for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
         }                      
        System.out.println(sum);

    }
}
    // write a java code to add the two matrix of 2*3
    
    
    

