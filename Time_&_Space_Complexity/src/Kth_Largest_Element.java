import java.util.*;
public class Kth_Largest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Which kth largest element you want to find?");
		int x = sc.nextInt();
		Arrays.sort(arr);
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.print(arr[n-x]);
	}

}
