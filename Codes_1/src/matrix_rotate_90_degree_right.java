import java.util.*;
public class matrix_rotate_90_degree_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m= sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
	    // transpose
	    for (int i = 0; i < arr.length; i++) {
	      for (int j = 0; j < i; j++) {
	        int temp = arr[i][j];
	        arr[i][j] = arr[j][i];
	        arr[j][i] = temp;
	      }
	    }
	    
	    // reverse columns, row by row
	    for (int i = 0; i < arr.length; i++) {
	      int li = 0;
	      int ri = arr[0].length - 1;
	      while (li <= ri) {
	        int temp = arr[i][li];
	        arr[i][li] = arr[i][ri];
	        arr[i][ri] = temp;

	        li++;
	        ri--;
	      }
	    }
		
		//printing the output array
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
