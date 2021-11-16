/*On the occasion of Diwali, Ninja received a game as gift from his father containing N rectangular blocks. The task of the game is to make the heights of these blocks in non increasing order without changing the given order of blocks provided you can rotate these blocks clockwise, i.e. width will become height and vice versa.
Note: You can rotate any number of blocks or no blocks at all and you can't change the order of blocks */

import java.util.*;
public class Codekaze_N_Rectangular_Blocks {


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] hi = new int[n];
        int[] wi = new int[n];
        for(int i=0;i<n;i++){
            hi[i] = sc.nextInt();
            wi[i] = sc.nextInt();
        }
        if(check(hi,wi)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        
        
    }
    
    public static boolean check(int[] hi, int wi[]){
        for(int i=0;i<hi.length;i++){
            for(int j=i+1;j<hi.length;j++){
                 if(hi[i]<hi[j]){
                     int temp = hi[i];
                     hi[i] = wi[i];
                     wi[i] = temp;
                     if(wi[i]<hi[j]){
                         int temp1 = hi[j];
                     	 hi[j] = wi[j];
                         wi[j] = temp1;
                     }
                     
                     if(hi[i]<hi[j] || hi[j]<hi[j+1])
                         return false;
                 }
            }
        }
        return true;
    }

}

/* Sample Input 1

3  
2 4  
4 5  
3 6

Sample Output 1

YES

Sample Input 2

4  
10 10  
8 8  
8 15  
9 9

Sample Output 2

NO

*/
