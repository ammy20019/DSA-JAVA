import java.util.*;
public class Array_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		displayArr(arr,0);
		
	}
	
	public static void displayArr(int[] arr, int idx){
		if(idx==arr.length) {
			return;
		}
		
		System.out.println(arr[idx]);
		displayArr(arr, idx+1);
		
    }

}
