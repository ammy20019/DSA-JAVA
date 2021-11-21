import java.util.*;
public class Stairs_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cp = countPaths(n, new int[n+1]);
		System.out.println(cp);
	}
	
	public static int countPaths(int n,int[] arr) {
		if(n==0) {
			return 1;
		} else if(n<0) {
			return 0;
		}
		
		if(arr[n]>0) {
			return arr[n]; 
		}
		
		int nm1 = countPaths(n-1,arr);
		int nm2 = countPaths(n-2,arr);
		int nm3 = countPaths(n-3,arr);
		int cp = nm1+nm2+nm3;
		
		arr[n] = cp;
		
		return cp;
	}

}
