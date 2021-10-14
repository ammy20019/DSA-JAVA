/* The monuments are named as:
1    2    3    4
5    6    7    8
9   10  11  12
13 14  15  16
The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
You are required to print the path followed by the traveller to visit all the monuments.
Refer to the photo for a better clarification.
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
3. You are required to diagonally traverse the upper half of the matrix and print the contents.*/


import java.util.*;
public class Matrix_Diagonal_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int n=sc.nextInt();
		
		int[][] arr = new int[m][n];
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]= sc.nextInt();
			}
		}

		int cnt=arr[0].length;
		//System.out.println(cnt);
		for(int j=cnt,k=0;j>0 && k<cnt;j--,k++) {
		for(int i=0,l=k;i<=j && l<cnt;i++,l++) {
			System.out.println(arr[i][l]);
		}
	} 
	
//	for(int j=0;j<=cnt;j++) {
//	for(int i=j;i<=cnt;i++) {
//		System.out.print(i);
//	}
//}
		
//		for(int i =0;i<arr.length;i++) {
//			for(int j=0;j<arr[0].length;j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
	}

}
