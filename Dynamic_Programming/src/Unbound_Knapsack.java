import java.util.*;
public class Unbound_Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int val[] = new int[n];
		int wt[] = new int[n];
		
		for(int i =0;i<n;i++) {
			val[i] = sc.nextInt();
		}
		for(int i =0;i<n;i++) {
			wt[i] = sc.nextInt();
		}
		
		int cap = sc.nextInt();
		int dp[] = new int[cap+1];
		for(int bagc=1 ;bagc <=cap;bagc++) {
			int max=0;
			for(int i=0;i<n;i++) {
				if(wt[i]<=bagc) {
					int rbagc =bagc-wt[i];
					int rbagv = dp[rbagc];
					int tbagv = rbagv+val[i];
				
				
				if(tbagv>max) {
				 max = tbagv;	
				}
				}
			}
			dp[bagc]=max;
		}
			System.out.println(dp[cap]);
	}

}

/*
 * input:
 * 5
15 14 10 45 30
2 5 1 3 4
7 
*/
