import java.util.*;
public class Fractional_Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] wt = new int[n];
		int[] val = new int[n];
		
		for(int i=0;i<n;i++) {
			wt[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			val[i] = sc.nextInt();
		}
	}

}
