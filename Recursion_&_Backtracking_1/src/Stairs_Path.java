import java.util.*;
public class Stairs_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> paths = new ArrayList<>();
		paths = getStairPaths(n);
	    System.out.println(paths);
	}
	
    public static ArrayList<String> getStairPaths(int n) {
        if(n==0) {
        	ArrayList<String> bres  =new ArrayList<>();
        	bres.add("");
        	return bres;
        } else if(n<0){
        	ArrayList<String> bres = new ArrayList<>();
        	return bres;
        }
        
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String path: paths1) {
        	paths.add(1+path);
        }
        for(String path: paths2) {
        	paths.add(2+path);
        }
        for(String path: paths3) {
        	paths.add(3+path);
        }
        
        return paths;
        
    }

}
