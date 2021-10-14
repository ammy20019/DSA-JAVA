/*1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
2. You are required to find the saddle price of the given matrix and print the saddle price. 
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.*/

import java.util.*;
public class Matrix_Saddle_Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int[][] arr = new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int maxc = arr[0][0];
		int minr = arr[0][0];
//		int maxc,minr;
		int temp=-1;
		int[] maxarr= new int[arr.length];
		for(int j=0;j<arr.length;j++) {

			maxc = arr[0][j];
			minr = arr[j][0];
			
		for(int i=0;i<arr.length;i++) {
			if(arr[i][j]>maxc) {
				maxc=arr[i][j];
			}
			//System.out.println(i+" "+j);
		}
		
		for(int k=0;k<arr.length;k++) {
			if(arr[j][k]<minr) {
				minr=arr[j][k];
			}
			//System.out.println(j+" "+k);
		}
		
		maxarr[j]=maxc;
		//System.out.println("max col"+maxc);
		//System.out.println("min row"+minr);
		
		
		
//		
//		if(maxc==minr) {
//			System.out.println(maxc);
//			System.out.println("found saddle price");
//		}else {
//			System.out.println("not found saddle price");
//		}
		
		for(int i=0;i<arr.length;i++) {
			if(minr==maxarr[i]) {
				temp=minr;
			} 
		}
		
		}
		
		if(temp==-1){
		    System.out.println("Invalid input");
		} else{
		    System.out.println(temp);
		}
	
		
	}

}
