/* 1. You are given a prefix expression.
2. You are required to evaluate it and print it's value.
3. You are required to convert it to infix and print it.
4. You are required to convert it to postfix and print it.

input: -+2/*6483

Output:
2
((2+((6*4)/8))-3)
264*8/+3-

*/

import java.util.*;
import java.io.*;
public class Prefix_Evaluation {

	  public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String exp = br.readLine();
		    Stack< Integer> vs = new Stack< >();      //1
		    Stack< String> is = new Stack< >();
		    Stack< String> ps = new Stack< >();

		    for (int i = exp.length() - 1; i >= 0; i--) {
		      char ch = exp.charAt(i);   //2

		      if (ch == '+' || ch == '-' || ch == '*' || ch == '/') { //3
		        int v1 = vs.pop();
		        int v2 = vs.pop();
		        int val = operation(v1, v2, ch);
		        vs.push(val);

		        String iv1 = is.pop();     //4
		        String iv2 = is.pop();
		        String ival = "(" + iv1 + ch + iv2 + ")";
		        is.push(ival);

		        String pv1 = ps.pop(); //5
		        String pv2 = ps.pop();
		        String pval = pv1 + pv2 + ch;
		        ps.push(pval);
		      } else {
		        vs.push(ch - '0'); //6
		        is.push(ch + "");
		        ps.push(ch + "");
		      }
		    }
		    System.out.println(vs.pop());    //7
		    System.out.println(is.pop());
		    System.out.println(ps.pop());
		  }
		  public static int operation (int v1, int v2, char op) {  //8


		    if (op == '+') {
		      return v1 + v2;
		    } else if (op == '-') {
		      return v1 - v2;
		    } else if (op == '*') {
		      return v1 * v2;
		    } else {
		      return v1 / v2;
		    }

		  }

}
