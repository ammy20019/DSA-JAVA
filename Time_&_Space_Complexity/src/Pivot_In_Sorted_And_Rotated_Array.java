import java.util.*;
public class Pivot_In_Sorted_And_Rotated_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int pivot = findPivot(arr);
		System.out.println(pivot);
	}
	
	public static int findPivot(int[] arr) {
		int lo=0;
		int hi=arr.length-1;
		
		while(lo<hi) {
			int mid=(hi+lo)/2;
			if(arr[mid]<arr[hi]) {
				hi=mid;
			} else {
				lo=mid+1;
			}
		}
		
		return arr[hi];
	}
}
