import java.util.*;
public class Remove_Prime {

	public static void solution(ArrayList<Integer> al) {
		for(int i=0;i<al.size();i++) {
			if(isPrime(al.get(i))==true) {
				al.remove(i);
			}
		}
	}
	
	public static boolean isPrime(int n) {
		boolean flag=true;
	    int m = n/2;
		for(int i=2;i<=m;i++){      
		    if(n%i==0){      
		     flag=false; 
		     return flag;
		    }    
		}
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(sc.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
