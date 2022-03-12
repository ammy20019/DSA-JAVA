/**
 * 
 */

/**
 * @author Admin
 *
 */
import java.util.*;
import java.io.*;
public class testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(fib(n,k));

	}
	
	public static int fib(int n, int k) {
		if(n== 1 || n== 0) return n;
		if(n<0) return 0;
		int tot=0;
		for(int i=1;i<=k;i++) tot+= fib(n-i,k);
		return tot;
	}

}
