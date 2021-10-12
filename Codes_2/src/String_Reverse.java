// Java program to ReverseString using StringBuilder

import java.lang.*;
import java.io.*;
import java.util.*;

class String_Reverse {

    public static void main(String[] args)

    {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String input = sc.nextLine();
 
//        StringBuilder input1 = new StringBuilder();
// 
//        // append a string into StringBuilder input1
//
//        input1.append(input);
// 
//        // reverse StringBuilder input1
//
//        input1.reverse();
//
//        // print reversed String
//
//        System.out.println(input1);

		//using without inbuilt function
		function_reverse(input);
		
    }
    
    public static void function_reverse(String str) {
    	String rev="";
    	for(int i=str.length()-1;i>=0;i--) {
    		//System.out.println(str.charAt(i)); /this code is for printing in reverse
    		rev =rev+str.charAt(i);
    	}
    	System.out.println(rev);
    	

    }
}