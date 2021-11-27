/* You are trapped in a maze and you have ‘K’ bombs. You can use one bomb to blow away 1 wall. You are currently at cell (1,1) and there are m doors. So you have to tell whether you can escape the maze. You can escape the maze only through the doors that are present. The array doors contain the coordinates of all the doors present in the maze.
You can move from cell (X,Y) to cell (X+1,Y), (X-1,Y), (X,Y+1), (X,Y-1). You cannot walk through a cell where there is a wall unless you use a bomb to blow away the wall. You can use a maximum of 'K' bombs in total. (‘D’ represents there is a door at cell[i][j], ‘.’ represents an empty cell, ‘#’ represents a wall is present in the cell[i][j]). 

Sample Input 2 :

1
2 2 0
.#
#D

Sample Output 2 :

False
*/

import java.util.*;
public class Contest_Escape_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m = sc.nextInt();
		int k= sc.nextInt();
		char[][] arr = new char[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=sc.next().charAt(0);
		}
	}
	boolean escape = escape(n, m, arr,  k);
	 System.out.println(escape);
	}
	
	
    static boolean escape(int n, int m, char[][] maze, int k) {
        // Write your code here.
        int bomb_count=0;
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && j>0){ //left
                if(maze[i][j-1]=='.')
                    j--;
                else if(maze[i][j-1]=='D')
                    return true;
               else if(maze[i][j-1]=='#')
                    if(bomb_count<=k){
                       bomb_count+=1;
                        continue; 
                    } else
                        return false;
            } else if(i>0 && j<m-1){ //right
                if(maze[i][j+1]=='.')
                    j++;
                 else if(maze[i][j+1]=='D')
                    return true;
                else if(maze[i][j+1]=='#')
                    if(bomb_count<=k){
                       bomb_count+=1;
                        continue; 
                    } else
                        return false;
            }
            else if(i>0){
                if(maze[i-1][j]=='.') //up
                    i--;
                else if(maze[i-1][j]=='D')
                    return true;
                else if(maze[i-1][j]=='#')
                    if(bomb_count<=k){
                       bomb_count+=1;
                        continue; 
                    } else
                        return false;
                
            } else if(j<m-1){  //down
                if(maze[i+1][j]=='.')
                    i++;
                else if(maze[i+1][j]=='D')
                    return true;
                else if(maze[i+1][j]=='#')
                    if(bomb_count<=k){
                       bomb_count+=1;
                        continue; 
                    } else
                        return false;
            }
        } return false;
    }
}	

	




