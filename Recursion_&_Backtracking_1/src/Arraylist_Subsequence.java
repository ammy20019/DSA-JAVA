/* substring = n(n+1)/2
 * while subsequence = 2^n
 */

import java.util.*;
public class Arraylist_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> res = gss(str);
		System.out.println(res);
		
	}
	

    public static ArrayList<String> gss(String str) {
    	if(str.length()==0) {
    		ArrayList<String> bres = new ArrayList<>();
    		bres.add("");
    		return bres;
    	}
    	
    	char ch = str.charAt(0);
    	String ros = str.substring(1);
    	ArrayList<String> rres = gss(ros);
    	
    	ArrayList<String> mres = new ArrayList<>();
    	for(String val:rres) {
    		mres.add(""+val);
    		mres.add(ch+val);
    	} //this will give [, a, b, ab, c, ac, bc, abc]
//    	for(String val:rres) {
//		mres.add(""+val);
//	}
//    	
//    	for(String val:rres) {
//    		mres.add(ch+val);
//    	}
//    	 for input abc it will give [, c, b, bc, a, ac, ab, abc]

    	
    	return mres;
    }

}
