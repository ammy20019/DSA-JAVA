import java.util.Scanner;
public class bar_chart{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		
		int max = arr[0];
		for(int i=0 ;i <arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		for(int floor = max;floor>=1;floor--) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>=floor){
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}