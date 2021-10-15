import java.util.*;
public class String_substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s= "abcd";
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}

}
