import java.util.*;
public class Zero_One_Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] vals = new int[n];
		int[] wts = new int[n];
		
		for(int i=0;i<n;i++) {
			vals[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			wts[i] = sc.nextInt();
		}
		
		int cap = sc.nextInt();
		int[][] dp = new int[n+1][cap+1];
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				
				if(j>=wts[i-1]) { //sufficent size
					int rCap = j-wts[i-1]; //remaining capacity
					if(dp[i-1][rCap]+vals[i-1] > dp[i-1][j]) { //agr already weight jyada nahi hai to 
						dp[i][j] = dp[i-1][rCap]+vals[i-1];	
					} else {
						dp[i][j] = dp[i-1][j]; //when i doesn't bat
					} 
				}
				else {
					dp[i][j] = dp[i-1][j]; //when i doesn't bat
				}
			}
		}
		System.out.println(dp[n][cap]);
	}

}

/*
 * Sample Input

5
15 14 10 45 30
2 5 1 3 4
7

Sample Output

75
*/
