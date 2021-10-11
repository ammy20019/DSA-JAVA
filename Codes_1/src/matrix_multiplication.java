import java.util.*;
public class matrix_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int m1= sc.nextInt();
		int arr1[][] = new int[n1][m1];
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		//array 2nd
		int n2=sc.nextInt();
		int m2= sc.nextInt();
		int arr2[][] = new int[n2][m2];
		for(int i =0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		if(m1!=n2) {
			System.out.println("Invalid Input");
			return;
		}
		
		//multiplying both
		int prd[][] = new int[n1][m2];
		for(int i =0;i<prd.length;i++) {
			for(int j=0;j<prd[0].length;j++) {
				for(int k=0;k<m1;k++) {
					prd[i][j]+=arr1[i][k]*arr2[k][j];
				}
				}
		}
		//n =rows
		//m = columns
		//printing matrix
		for(int i =0;i<prd.length;i++) {
			for(int j=0;j<prd[0].length;j++) {
				System.out.print(prd[i][j]+" ");
				}
				System.out.println();
		}
	}

}
