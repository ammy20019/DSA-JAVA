import java.util.*;
public class Array_First_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(firstIndex(arr,0,x));
	}
	
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length-1) {
        	return idx;
        }
        
        
        if(arr[idx]==x) {
        	return idx;
        }
        int fiisa = firstIndex(arr,idx+1,x);
    	return fiisa;
    }

}
