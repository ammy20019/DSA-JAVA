import java.util.*;
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		printPermutations(str,"");
	}
	
public static void printPermutations(String str, String asf) {
    
	if(str.length()==0) {
		System.out.println(asf);
		return;	
	}
	
	
	for(int i =0;i<str.length();i++) {
		char ch = str.charAt(i);
		String lpart = str.substring(0,i);
		String rpart = str.substring(i+1);
		String roq = lpart+rpart;
		printPermutations(roq,asf+ch);
	}
	
    }

}
