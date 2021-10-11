import java.util.*;
public class selection_Sort {
	public static void main(String[] args) {
		
		int arr[] = {34,2,38,9,76};
		int n= arr.length;
		int min;
		for(int i=0;i<n-2;i++) {
			min =i;
			for(int j=i+1;j<n-1;j++) {
				if(arr[j]<arr[min])
					min = j;
				int temp = arr[j];
				arr[j] = arr[min];
				arr[min]= temp;
				
			}
		}
		
		for(int i = 0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
