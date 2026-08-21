public class Printsummatrix {
    public static void main(String[] args) {
        int [][] a={{5,5,5},
                    {3,4,5}
                            };
        int [][] b={{3,4,5},
                    {5,5,5}
                            };
        int [][] sum={{0,0,0},
                    {0,0,0}
                            };    
                            
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++) {
            sum[i][j] =a[i][j]+b[i][j];
        }
      }  
      
      
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++) {
            System.out.print(sum[i][j]+ "  ");
        }

        System.out.println(" ");
      }

    }
}