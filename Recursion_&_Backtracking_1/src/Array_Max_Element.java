import java.util.*;
public class Array_Max_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxOfArray(arr,0));
	}

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1) {
        	return arr[idx];  //base case
        }
    	int misa = maxOfArray(arr,idx+1);//max in smaller array    	
    	if(misa>arr[idx]) {
    		return misa;
    	} else {
    		return arr[idx];
    	}
      
    }
}
