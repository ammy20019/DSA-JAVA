/* 1. You are given an array(arr) of distinct integers and a target.
2. You have to print all the pairs having their sum equal to the target.

nlogn time complexity need to do */

import java.util.*;
public class Target_Sum_Pair_1 {

	  public static void targetSumPair(int[] arr, int target){
		    //write your code here
		  Arrays.sort(arr);
		  int i=0,k=arr.length-1;
		  while(i<k) {
			  if(arr[i]+arr[k]>target) {
				  k--;
			  } else if(arr[i]+arr[k]<target) {
				  i++;
			  } else {
				  System.out.println(arr[i]+", "+arr[k]);
				  i++;
				  k--;
			  }
		  }

		  }
		  public static void main(String[] args) throws Exception {
		    Scanner scn = new Scanner(System.in);
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0 ;i < n; i++){
		      arr[i] = scn.nextInt();
		    }
		    int target = scn.nextInt();
		    targetSumPair(arr,target);
		  }
}
