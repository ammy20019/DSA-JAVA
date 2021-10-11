import java.util.*;
public class bar_chart_inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		for(int i=0;i<max;i++) {
			for(int j=0;j<n;j++){
					if(arr[j]<=i) {
						System.out.print("\t");
					} else {
						System.out.print("*\t");
					}
		}
			System.out.println();
	}

}
}