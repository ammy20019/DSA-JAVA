/*1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.*/

import java.util.*;
public class Maze_Paths_With_Jumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<String> path = getMazePaths(1,1,n,m);
		System.out.println(path);

	}
	
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
       if(sr==dr && sc==dc) {
    	   ArrayList<String> bres = new ArrayList<>();
    	   bres.add("");
    	   return bres;
       }
        
       ArrayList<String> hpaths = new ArrayList<>();
       ArrayList<String> dpaths = new ArrayList<>();
       ArrayList<String> vpaths = new ArrayList<>();
       
       ArrayList<String> paths = new ArrayList<>();
       
       if(sc<dc) {
    	   hpaths = getMazePaths(sr,sc+1,dr,dc);
       }
       if(sr<dr) {
    	   vpaths = getMazePaths(sr+1,sc,dr,dc);
       }   
       if(sr==sc) {
    	   dpaths = getMazePaths(sr+1,sc+1,dr,dc);
       }
       
       for(String hpath: hpaths) {
   		paths.add("h"+hpath);
   	}
   	
   	for(String vpath: vpaths) {
   		paths.add("v"+vpath);
   	}
     
   	for(String dpath:dpaths) {
   		paths.add("d"+dpath);
   	}
       return paths;
      
		
    }

}
