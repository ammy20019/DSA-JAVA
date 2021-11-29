/*1. You are given a number n, representing the count of coins.
2. You are given n numbers, representing the denominations of n coins.
3. You are given a number "amt".
4. You are required to calculate and print the number of permutations of the n coins using which the 
     amount "amt" can be paid.

Note1 -> You have an infinite supply of each coin denomination i.e. same coin denomination can be 
                  used for many installments in payment of "amt"
Note2 -> You are required to find the count of permutations and not combinations i.e.
                  2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of same 
                  combination. You should treat them as 3 and not 1.
                  */

import java.util.*;
public class Coin_Change_Permuatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  =sc.nextInt();
		int[] coins = new int[n];
		for(int i=0;i<coins.length;i++) {
			coins[i] = sc.nextInt();
		}
		
		int amt = sc.nextInt(); //target sum 
		int dp[] = new int[amt+1];
		dp[0]=1;
		for (int i = 1; i < dp.length; i++) {
		      for (int coin : coins) {
		        if (i >= coin) {
		          dp[i] += dp[i - coin]; //remaining amt = i-coin.. for eg
		          						// suppose for loop when i=8 nd coins are 2,3,5,6 ..8>2 so dp[8] = dp[8-2] => dp[8]=dp[6] and so on   
		        }
		      }
		    }
		System.out.println(dp[amt]);
	}

}


/*
Sample Input

4
2
3
5
6
7

Sample Output

5
*/