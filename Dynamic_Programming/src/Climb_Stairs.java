import java.util.*;
final class Climb_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(countPaths(arr,0,n));
	}
	
	public static int countPaths(int[] arr,int index,int len) {
		
		if(index==len) {
			return 1;
		}
		int count =0;
		for(int jump=1;jump<=arr[index];jump++) {
		 if(jump+index<=len) {
			 count += countPaths(arr,jump+index,len);
		 } else {
			 break;
		 }
		}
		return count;
	}

}
