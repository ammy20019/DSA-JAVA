import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_Print_All_Indices {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        if(idx==arr.length) {
        	return -1;
        }
        int liisa = lastIndex(arr,idx+1,x); //last index in smaller array
       
        if(liisa==-1) {
        	if(arr[idx]==x) {
        		return idx;
        	} else {
        		return -1;
        	}
        } else {
        	return liisa;
        }
    	
    }
}
