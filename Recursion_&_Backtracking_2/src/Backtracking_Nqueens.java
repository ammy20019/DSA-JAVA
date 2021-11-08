import java.util.*;
public class Backtracking_Nqueens {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chess[][] = new int[n][n];
        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        
    	if(row == chess.length) {
    		System.out.println(qsf+".");
            for(int i=0;i<chess.length;i++) {
            	for(int j=0;j<chess[0].length;j++) {
            		System.out.print(chess[i][j]);
            	}
            	System.out.println();
            }
    		return;
    	}
    	
    	for(int col=0;col<chess.length;col++) {
    		if(isSafe(chess,row,col)==true) {
    			chess[row][col] =1;
        		printNQueens(chess,qsf+row+"-"+col+", ",row+1);
        		chess[row][col]=0;
    		}
    		
    	}
    	
    }
    
    public static boolean isSafe(int[][] chess,int row, int col) {
    	//this code is for checking in the previous rows in the same column 
    	for(int i =row-1,j = col;i>=0;i--) {
    		if(chess[i][j]==1) {
    			return false;
    		}
    	}
    	
    	//checking left diagonals if any queen is placed
    	for(int i=row-1,j=col-1;j>=0 && i>=0;i--,j--) {
    		if(chess[i][j]==1) {
    			return false;
    		}
    	}
    	
    	//checking right diagonal if any queen is placed
    	for(int i = row-1,j=col+1;j<chess.length && i>=0;i--,j++ ) {
    		if(chess[i][j]==1) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
