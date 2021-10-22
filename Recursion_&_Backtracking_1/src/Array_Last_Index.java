import java.util.Scanner;

public class Array_Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(lastIndex(arr,0,x));
	}
	
    public static int lastIndex(int[] arr, int idx, int x){
        
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
