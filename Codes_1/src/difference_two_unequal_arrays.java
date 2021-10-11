import java.util.Scanner;

public class difference_two_unequal_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] a1 = new int[n1];
		for(int i = 0;i<n1;i++) {
			a1[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int[] a2 = new int[n2];
		for(int i = 0;i<n2;i++) {
			a2[i] = sc.nextInt();
		}
		
		int diff[] = new int[n2];
		int c = 0;
		int i=a1.length-1;
		int j=a2.length-1;
		int k=diff.length-1;
		
		while(k>=0) {
			int d=0;
			int alv =i>=0?a1[i]:0;
			if(a2[j]+c>=alv) {
				d=a2[j]+c-alv;
				c=0;
			}
			else {
				d=a2[j]+c+10-alv;
				c=-1;
			}
			diff[k] = d;
			i--;
			k--;
			j--;
		}
		
	     int idx = 0;
	     while(idx<diff.length) {
	    	 if(diff[idx]==0) {
	    		 idx++;
	    	 } else {
	    		 break;
	    	 }
	     }
		
	     while(idx<diff.length) {
	    	 System.out.println(diff[idx]);
	    	 idx++;
	     }
		
	}

}
