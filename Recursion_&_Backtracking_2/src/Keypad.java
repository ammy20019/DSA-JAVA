import java.util.*;
public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printKPC(str,"");

	}
	
	static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};
    public static void printKPC(String str, String asf) {
        if(str.length()==0) {
        	System.out.println(asf);
        	return;
        }
    	char ch = str.charAt(0);
        String roq = str.substring(1);
        String codesforch = codes[ch-'0'];
        //character ko integer mn convert krna hai to '0' minus krna padega like agar hum ch pass krenge then it is
        // codes['6'] which means in ascii codes[54] so ascii value of '0' is 48 so we can sibtrat '6'-'0' we will get 0
        for(int i =0;i<codesforch.length();i++) {
        	char cho = codesforch.charAt(i);
        	printKPC(roq,asf+cho);
        }
        
        
    }

}
