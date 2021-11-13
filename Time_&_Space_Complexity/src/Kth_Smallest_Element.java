import java.util.*;
public class Kth_Smallest_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Which kth smallest element u want to find? ");
		int f = sc.nextInt();
		Arrays.sort(arr);
		System.out.println("The "+f+"th smallest element is "+arr[f-1]);
		
		
	}

}
