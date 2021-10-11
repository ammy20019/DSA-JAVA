/*In a country of novice government, the economic system is changed where only coins are used that too of various denominations.
 *  Whenever a foreigner visits this country, they visit a money exchanger to get the currency of the same country. 
 *  As the foreigner is unaware of the denomination of the country, the money exchange prefers to tell them the denomination 
 *  which is the nearest maximum and nearest minimum to the denomination mentioned by the foreigner. In case they get the 
 *  correct guess of the denomination, they are told the same denomination. The denominations are always quoted in ascending order.

Example 1: In a country, 8 given denominations are as follows
[5, 10, 15, 22, 33, 40, 42, 55]

The foreigner asks for denomination 25.
The money exchange tells them that denominations of 33 and 22 are available. */

import java.lang.Math;
public class broken_economy_bs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 10, 15, 22, 33, 40, 42, 55};
		
		int l=0;
		int h = arr.length-1;
		
		int data = 16;
		while(l<=h) {
			int m = (l+h)/2;
			if(data>arr[m]) {
				l=m+1;
				
			} else if(data<arr[m]) {
				h=m-1;
				
			} else {
				//System.out.println(m);
				return;
			}
		}
		System.out.println(arr[l]);
		System.out.println(arr[h]);
		//System.out.println(-1); //not found
	}
		
	}


