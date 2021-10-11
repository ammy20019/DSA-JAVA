import java.util.*;
public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,23};
		int n = a.length;
		int t;
		for(int i =0;i<a.length/2;i++) {
			t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
		}
		
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
