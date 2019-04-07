import java.util.HashMap;

public class MapExample1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		map.put(10,"Ram"); 
		map.put(20,"Sam");
		map.put(30,"Tam");
		map.put(null,"null");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get(20));
		System.out.println(map.keySet());
		System.out.println(map.values());
	} 
}
