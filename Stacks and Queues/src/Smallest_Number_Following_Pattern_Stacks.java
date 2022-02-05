/* increment by 1 if 'i' if 'd' then decrement by 1 and nos should not repeaet
 * 
 * input
 * ddid

 * Output
 * 32154
 */

import java.util.*;

public class Smallest_Number_Following_Pattern_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		Stack<Integer> st = new Stack<>();
		 int num = 1;
		    for (int i = 0; i < str.length(); i++) {
		      char ch = str.charAt(i);
		      if (ch == 'd') { 
		        st.push(num);
		        num++;
		      } else { 
		        st.push(num);
		        num++;
		        while (st.size() > 0) {
		          System.out.print(st.pop());
		        }
		      }
		    }
		    st.push(num); 
		    while (st.size() > 0) {
		      System.out.print(st.pop());
		    }

		//System.out.println(st);

	}

}
