import java.util.*;
public class Sort_01 {

	public static void sort01(int[] arr){
		int j=0,i=0;
		while(i<arr.length){
			if(arr[i]==0) {
				swap(arr,i,j);
				i++;
				j++;
			} else {
				i++;
			}
		}
		
	}
	
	public static void swap(int[] arr, int i, int j) {
	    System.out.println("Swapping index " + i + " and index " + j);
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sort01(arr);
		print(arr);
	}
	
	public static void print(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
