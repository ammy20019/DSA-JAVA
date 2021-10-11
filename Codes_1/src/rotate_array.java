import java.util.*;
public class rotate_array {
	
	public static void reverse(int[] a, int i, int j) {
		int li = i;
		int ri=j;
		
		while(li<ri) {
			int temp = a[li];
			a[li]=a[ri];
			a[ri]=temp;
			li++;
			ri--;
		}
	}
	public static void rotate(int[] a, int k){
	    // write your code here
		k=k%a.length;
		if(k<0) {
			k=k+a.length;
		}
		reverse(a,0,a.length-k-1);
		reverse(a,a.length-k,a.length-1);
		reverse(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		rotate(arr,3);
		
	    
	}

}
