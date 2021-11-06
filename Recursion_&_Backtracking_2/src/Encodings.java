import java.util.*;
public class Encodings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		printEncodings(str,"");
	}
	
	  public static void printEncodings(String ques, String ans) {
		    if (ques.length() == 0) {
		      System.out.println(ans);
		      return;
		    } else if (ques.length() == 1) {
		      if (ques.charAt(0) == '0') {
		        return;
		      } else {
		        String ch0 = ques.substring(0, 1);
		        String roq0 = ques.substring(1);
		        String code0 = (char)('a' + (Integer.parseInt(ch0) - 1)) + "";
		        /*Yaha pe hum us string ko integer mn convert kr rhe aur wo krne k baad map kr rhe values like for e.g.
		         * for printing 'a' if we give input 1 -> 'a'+(1-1)+"" => 'a'
		         * If we give input 3 -> 'a'+(3-1)+"" => 'a'+2 => 'c'
		         * then again these strings we got.. we are converting it into char again using type casting.
		         *  
		         *  */
		        printEncodings(roq0, ans + code0);
		      }
		    } else {
		      if (ques.charAt(0) == '0') {
		        return;
		      } else {
		        String ch0 = ques.substring(0, 1);
		        String roq0 = ques.substring(1);
		        String code0 = (char)('a' +(Integer.parseInt(ch0) - 1)) + "";
		        printEncodings(roq0, ans + code0);

		        String ch01 = ques.substring(0, 2);
		        String roq01 = ques.substring(2);
		        String code01 = (char)('a' +(Integer.parseInt(ch01) - 1)) + "";

		        if (Integer.parseInt(ch01) <= 26) {
		          printEncodings(roq01, ans + code01);
		        }
		      }
		    }}
}
