import java.util.*;
public class Number_Power_N {

	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		int temp =x*power(x,n-1);
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(x,n));
	}

}
