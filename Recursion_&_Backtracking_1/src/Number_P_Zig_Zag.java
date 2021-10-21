/* input 3
 * output 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
 */

import java.util.*;
public class Number_P_Zig_Zag {
		public static void pzz(int n) {
			if(n==0) {
				return;
			}
			
			System.out.println(n);
			pzz(n-1);
			System.out.println(n);
			pzz(n-1);
			System.out.println(n);
	
		}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			pzz(n);
		}

}
