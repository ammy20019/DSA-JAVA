import java.util.*;
public class Factorial {

	public static int factorial(int n) {
		
	    if (n == 1) { //1
	        return 1;
	      }

	      int fn = n * factorial(n - 1);  
	      return fn;  
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}

}
