/* input 
 * Have  2 a 32 @# wonderful,  day
 * 
 * 
 * output
day wonderful @# 32 a 2 Have 

 */

import java.util.*;
public class HP_Reversing_Removing_Space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      String s = sc.nextLine();
	      
	      //System.out.println(s.trim().replaceAll("\\s{2,}", " "));
	      String s1 = s.trim().replaceAll(",\\s{2,}", " ");
	     String[] splitStr = s1.split("\\s+");
//	     for(int i=0;i<splitStr.length;i++){
	 //        System.out.println(splitStr[i]);
	   //  }
	     
	     
	     for(int i=splitStr.length-1;i>=0;i--){
	         System.out.print(splitStr[i]+" ");
	     }
	}

}
