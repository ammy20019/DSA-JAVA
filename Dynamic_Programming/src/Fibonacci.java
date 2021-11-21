import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fibn  = Fib(n,new int[n+1]);
		System.out.println(fibn);
		
	}
	
	public static int Fib(int n, int[] arr) {
		if(n==0 || n==1) {
			return n;
		}
		
		if(arr[n]!=0) {
			return arr[n];
		}
		
		int fibn1 =Fib(n-1, arr);
		int fibn2 =Fib(n-2, arr);
		int fibn=fibn1+fibn2;

		arr[n]=fibn;
		return fibn;
	}
}
