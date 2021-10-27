import java.util.*;
public class Maze_Paths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<String> path = getMazePaths(1,1,n,m);
		System.out.println(path);
	}
	
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {                              //1
            ArrayList< String> bres = new ArrayList< >();
            bres.add("");
            return bres;
          }
        
        
    	ArrayList<String> hpaths = new ArrayList<>();
    	ArrayList<String> vpaths = new ArrayList<>();
    	
    	ArrayList<String> paths = new ArrayList<>();
    	if(sr<dr) {
    		hpaths = getMazePaths(sr+1,sc,dr,dc);
    	}
    	
    	if(sc<dc) {
    		vpaths = getMazePaths(sr,sc+1,dr,dc);
    	}
    	
    	for(String hpath: hpaths) {
    		paths.add("h"+hpath);
    	}
    	
    	for(String vpath: vpaths) {
    		paths.add("v"+vpath);
    	}
    	

    	
    	return paths;
    }

}
