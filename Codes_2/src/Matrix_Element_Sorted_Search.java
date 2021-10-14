/*1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a. 
Note - Each row and column is sorted in increasing order.
3. You are given a number x.
4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
5. In case element is not found, print "Not Found".*/


import java.util.*;
public class Matrix_Element_Sorted_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int[][] arr= new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}	
		}
		
		int x = sc.nextInt();
		int row=-1,col=-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++){
				if(x==arr[i][j]) {
					row = i;
					col = j;
					break;
				} 
			}
		}
		
		if(row==-1) {
			System.out.println("Not Found");
			
		} else {
			System.out.println(row);
			System.out.println(col);
		}
	}

}
