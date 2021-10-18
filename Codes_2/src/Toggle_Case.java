/*1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string. 

logic: distance btw 'a' and 'p' is equal to distance btw 'A' and 'P'.. matlab dono k beech mn same no of elements honge
*/

import java.util.*;
public class Toggle_Case {

	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0;i<sb.length();i++) {
			char ch = sb.charAt(i);
			
			if(ch>='a' && ch<='z') {
				char uch = (char)('A'+ch-'a');
				sb.setCharAt(i, uch);
			} else if(ch>='A' && ch<='Z') {
				char lch = (char)('a'+ch-'A');
				sb.setCharAt(i, lch);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(toggleCase(str));
	}

}
