/* 1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing the height of bars in a bar chart.
3. You are required to find and print the area of largest rectangle in the histogram.

e.g.
for the array [6 2 5 4 5 1 6] -> 12
*/

import java.util.*;
import java.io.*;
public class largest_Area_Histogram {

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    int[] rb = new int[a.length]; //right border
	    Stack<Integer> st = new Stack<>();
	    st.push(a.length-1); //aakhri index ka right boundary
	    rb[a.length-1] = a.length;
	    
	    for(int i=a.length-2;i>=0;i--) {
	    	while(st.size()>0 && a[i]<=a[st.peek()]) {
	    		st.pop();
	    	} 
	    	
	    	if(st.size()>0) {
	    		rb[i] = st.peek();
	    	} else {
	    		rb[i] = a.length;
	    	}
	    	st.push(i);
	    }
	    
	    int lb[] = new int[a.length]; //left border
	    st = new Stack<>();
	    st.push(0); //aakhri index ka left boundary
	    lb[0] = -1;
	    
	    for(int i=1;i<a.length;i++) {
	    	while(st.size()>0 && a[i]<=a[st.peek()]) {
	    		st.pop();
	    	} 
	    	
	    	if(st.size()>0) {
	    		lb[i] = st.peek();
	    	} else {
	    		lb[i] = -1;
	    	}
	    	st.push(i);
	    }
	    
	    
	    int maxArea =0;
	    
	    
	    for(int i =0;i<a.length;i++) {
	    	int width = rb[i] - lb[i] - 1;
	    	int area = width*a[i];
	    	if(area>maxArea) {
	    		maxArea = area;
	    	}
	    }
	    System.out.println(maxArea);
	 }
}
