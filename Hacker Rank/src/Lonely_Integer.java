/* 
Input:
7
1 2 3 4 3 2 1
Output: 
4 */
import java.util.*;
public class Lonely_Integer {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<arr.length;i++){
          arr[i] = sc.nextInt();
      }
      if(arr.length == 1){
          System.out.println(arr[0]);
      } else{
          int res = arr[0];
          for(int j=1;j<arr.length;j++){
            res = res^arr[j];
      }
      System.out.println(res);
        }
      }
}