import java.util.*; //if we only import map then it will show error
public class MapsBasics {
	public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(96,"Merin");
        map.put(80,"Amit");
        map.put(100,"Jesse");
        System.out.println(map);
        
        Map<String, String> ob = new HashMap<String, String>();
        ob.put("first","way");
        ob.put("second","Gate");
        ob.put("third","Wall");
        ob.put("fourth","person");
        System.out.println(map.get("third"));
        System.out.println(ob);
        
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        
                Map<Integer, String> hm = new HashMap<>();

        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
  
        Hashtable<Integer, String> ht2
            = new Hashtable<Integer, String>(hm);

  
        System.out.println("Mappings of ht2 : " + ht2);
    }

}
