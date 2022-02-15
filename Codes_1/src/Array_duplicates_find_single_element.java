import java.util.*;
public class Array_duplicates_find_single_element {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr = {12,15,65,12,78,23,65,15,90,23,90};
		int res = arr[0];
		for(int i=1;i<arr.length;i++) {
			res = res^arr[i]; //here ^ is an bitwise XOR operation 
		}
		System.out.println(res);
	}

}
