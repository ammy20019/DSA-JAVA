/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

 

Example 1:

Input: s = "()"
Output: true

*/


import java.util.Stack;
import java.util.Scanner;
public class Valid_Parenthesis_leetcode {
	
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String s = sc.nextLine();
	  System.out.println(isValid(s));
	}

	
	public static boolean isValid(String s) {
	     Stack<Character> stack = new Stack<>();

	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[') {
	                stack.push(s.charAt(i));
	            } else{
	                if(stack.size()==0){
	                    return false;
	                }
	                if(s.charAt(i)=='}'){
	                    if(stack.peek()!='{'){
	                        return false;
	                    } else {
	                        stack.pop();
	                    }
	                }

	                if(s.charAt(i)==']'){
	                    if(stack.peek()!='['){
	                        return false;
	                    } else {
	                        stack.pop();
	                    }
	                }

	                if(s.charAt(i)==')'){
	                    if(stack.peek()!='('){
	                        return false;
	                    } else {
	                        stack.pop();
	                    }
	                }
	            }
	        }

	        if(stack.size() ==0){
	            return true;
	        } else 
	            return false;
	    }
	
}
