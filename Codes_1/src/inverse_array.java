import java.util.*;
public class inverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		int arr[] = {4,0,2,3,1};
		int inv[] = new int[arr.length];
//		
//		for(int i=0;i<n;i++) {
//			arr[i] = sc.nextInt();
//		}
		
		int temp;
		for(int j=0;j<arr.length;j++) {
		   temp =arr[j];
		   inv[temp] = j;
		   
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(inv[i]);
		}
	}

}

