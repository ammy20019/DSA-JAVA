import java.util.*;
public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printSS(str,"");
	}
	
    public static void printSS(String str, String ans) {
    	if(str.length() == 0) {
    		System.out.println(ans);
    		return;
    	}
    	
    	char ch = str.charAt(0);
    	String roq = str.substring(1);
    	
    	printSS(roq,ans+ch);
    	printSS(roq,ans+"");
    	
    }


}
