import java.util.*;
public class two_summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {8,9};
		int b[] = {9,3};
		int sum=0;
		int sum1 =0;
		int r=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				sum = a[i]+b[j];
				sum1 = a[j]+b[i];
				if(sum>sum1) {
					r =r+sum;
				} else {
					r=r+sum1;
				}
				System.out.println("sum "+r);
				//System.out.println("sum1"+sum);
			}
		}
		
		//System.out.println(sum);
	}

}
