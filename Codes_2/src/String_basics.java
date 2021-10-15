import java.util.*;
public class String_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String s1 = sc.nextLine(); //this will take whole line as a input for eg:  abc def ..here it will take whole string
//		String s2 = sc.next();   //while when using next it will take two separated string s2 as abc and s3 as def
//		String s3 = sc.next();
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		/* Example input
		  Hello my name is amit 
Software Engineering

output: 
Hello my name is amit 
Software
Engineering
*/

//		String str = sc.next();
//		System.out.println(str.length());
		
//		for(int i =0;i<str.length();i++) {
//			System.out.println(str.charAt(i));
//		}
//		
		//str.charAt(0)="z"; //won't work
		
		
//		System.out.println(str.substring(0,3));
//		System.out.println(str.substring(3));
//		
//		String s4 = "hello";
//		String s5 = "World";
//		System.out.println(s4+" "+s5);
//		
		//This is important 
//		System.out.println("Hello"+10+20); //it will give Hello1020 because compiler evaules from right so first Hello10 then add 20 so Hello1020
//		System.out.println(10+20+"Hello");
		
		
		//Split
		String str1= "Hello I am a software engineer at google";
		String str2 = "Hello,I,am,a,software engineer";
		String[] parts = str1.split(" ");
		String[] parts1 = str2.split(",");
		for(int i=0;i<parts1.length;i++) {
			//System.out.println(parts[i]);
			System.out.println(parts1[i]);
		}
		
	}

}
