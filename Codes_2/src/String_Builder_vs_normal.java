
public class String_Builder_vs_normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 100000;
		
		long start = System.currentTimeMillis();
//		String s = " ";
//		for(int i=0;i<n;i++) {
//			s+=i;
//		}
		
		//this above code took 7367 ms
		
		StringBuilder sb  =new StringBuilder();
		for(int i=0;i<n;i++) {
			sb.append(i);
		}
		
		//using string builder it took 17 ms
		long end = System.currentTimeMillis();
		long duration =  end - start;
		System.out.println(duration);
		
		
	}

}
