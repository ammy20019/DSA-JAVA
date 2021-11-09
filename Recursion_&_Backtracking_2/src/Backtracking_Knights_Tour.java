import java.util.*;
public class Backtracking_Knights_Tour {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] chess = new int[n][n];
        printKnightsTour(chess,r,c,1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int move) {
        //jb knight board k bahar jaaye to return krdo
    	if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c]>0)
        	return;
        //aaakhri move mn hum store kr rhe move ko fir display kr rhe thn 0 assign kr rhe
        else if(move == chess.length*chess.length) {
        	chess[r][c] = move;
        	displayBoard(chess);
        	chess[r][c] = 0;
        	return;
        }
         
    	//move kiya hai
        chess[r][c]=move;
        //saare 8 direction mn jaa skta hai considering clockwise (2 straight and 1 left or right)
        printKnightsTour(chess, r-2, c+1, move+1);
        printKnightsTour(chess, r-1, c+2, move+1);
        printKnightsTour(chess, r+1, c+2, move+1);
        printKnightsTour(chess, r+2, c+1, move+1);
        printKnightsTour(chess, r+2, c-1, move+1);
        printKnightsTour(chess, r+1, c-2, move+1);
        printKnightsTour(chess, r-1, c-2, move+1);
        printKnightsTour(chess, r-2, c-1, move+1);
        chess[r][c] =0;
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
