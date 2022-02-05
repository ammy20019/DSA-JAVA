/*
 * 
 * 1. You are given a number n, representing the number of time-intervals.
2. In the next n lines, you are given a pair of space separated numbers.
3. The pair of numbers represent the start time and end time of a meeting (first number is start time and second number is end time)
4. You are required to merge the meetings and print the merged meetings output in increasing order of start time..st
 * Sample Input

6
22 28
1 8
25 27
14 19
27 30
5 12

Sample Output

1 12
14 19
22 30
 */

import java.io.*;
import java.util.*;
public class Merge_Overlapping_Interval {
	  public static void main(String[] args) throws Exception {
		    // write your code here
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine());
		    int[][] arr = new int[n][2];

		    for (int j = 0; j < n; j++) {
		      String line = br.readLine();
		      arr[j][0] = Integer.parseInt(line.split(" ")[0]);
		      arr[j][1] = Integer.parseInt(line.split(" ")[1]);
		    }

		    mergeOverlappingIntervals(arr);
		  }

		  public static void mergeOverlappingIntervals(int[][] arr) {
		    Pair[] pairs = new Pair[arr.length];
		    for (int i = 0; i < arr.length; i++) {
		      pairs[i] = new Pair(arr[i][0], arr[i][1]);
		    }

		    Arrays.sort(pairs);
		    Stack< Pair> st = new Stack< >();
		    for (int i = 0; i < pairs.length; i++) {
		      if (i == 0) {
		        st.push(pairs[i]);
		      } else {
		        Pair top = st.peek();
		        if (pairs[i].st > top.et) {
		          st.push(pairs[i]);
		        } else {
		          top.et = Math.max(top.et, pairs[i].et);
		        }
		      }
		    }

		    Stack< Pair> rs = new Stack< >();
		    while (st.size() > 0) {
		      rs.push(st.pop());
		    }

		    while (rs.size() > 0) {
		      Pair p = rs.pop();
		      System.out.println(p.st + " " + p.et);
		    }

		  }

		  public static class Pair implements Comparable< Pair> {
		    int st;
		    int et;

		    Pair(int st, int et) {
		      this.st = st;
		      this.et = et;
		    }

		    public int compareTo(Pair other) {
		      if (this.st != other.st) {
		        return this.st - other.st;
		      } else {
		        return this.et - other.et;
		      }
		    }
		  }
}
