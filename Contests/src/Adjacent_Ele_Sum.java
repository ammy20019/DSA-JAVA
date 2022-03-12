import java.util.Scanner;

public class Adjacent_Ele_Sum {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int[][] arr = new int[n][m];
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              arr[i][j] = sc.nextInt();
          }
      }
      
      int jump[][] = new int[n][m];
      for(int i=0;i<n;i++){ //i is row .... j is column
          for(int j=0;j<m;j++){
              //when the element is first row
              if(i==0){
                  if(j==0){
                      //traverse right and bottom
                      jump[i][j] = arr[i][j+1]+arr[i+1][j];
                  } else if(j==m-1){
                      //traverse left and bottom
                      jump[i][j] = arr[i][j-1]+arr[i+1][j];
                  } else{
                      int temp = arr[i][j+1]; //right
                    temp = temp+arr[i][j-1];//left
                    temp= temp+arr[i+1][j];//bottom
                    jump[i][j] = temp;
                  }
                  
              } else if(j==0){
                  //when the element is in first column
                  if(i==n-1){
                      //traverse right and top
                      jump[i][j]=arr[i][j+1]+arr[i-1][j];
                  } else if(i==n-1){
                      //top+left
                      jump[i][j]=arr[i][j-1]+arr[i-1][j];
                  } else{
                      //top + roght+ left
                      jump[i][j]=arr[i-1][j]+arr[i][j+1]+arr[i][j-1];
                  }
                  
              } else if(i==n-1){
                  if(j==0){
                      //traverse right and top
                      jump[i][j]=arr[i][j+1]+arr[i-1][j];
                  } else if(j==m-1){
                      //traverse top and left
                      jump[i][j]=arr[i-1][j]+arr[i][j-1];
                  } else{
                      //top + roght+ left
                      jump[i][j]=arr[i-1][j]+arr[i][j+1]+arr[i][j-1];
                  }
                  
              } else if(j==m-1){
                  if(i==0){
                      //traverse left and bottom
                      jump[i][j] = arr[i][j-1]+arr[i+1][j];
                  } else if(i==n-1){
                      //traverse top and left
                      jump[i][j]=arr[i-1][j]+arr[i][j-1];
                  } 
                  else{
                      //left+top+bottom
                      jump[i][j]=arr[i][j-1]+arr[i][j-1]+arr[i+1][j];
                  }
              }
              else{
                  //traverse right+left+top+bottom
                  jump[i][j]=arr[i-1][j]+arr[i][j+1]+arr[i][j-1]+arr[i+1][j];
              }
          }
      }
      
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              System.out.print(jump[i][j]+" ");
          }
          System.out.println();
      }
    }
}

/* input 1

2
2
3 4 
2 3

input 2
2
3
1 2 3
2 3 4

output 1
6 6 
6 6 


output 2 
4 7 6 
4 8 6 

Amit Kumar Sahu
*/