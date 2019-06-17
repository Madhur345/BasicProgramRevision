import java.util.HashMap;
import java.util.Map.Entry;

public class MapExample4 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(100, "Ram");
		map.put(200, "Sam");
		map.put(300, "Kam");
		System.out.println(map);
		for(Entry<Integer,String> entry:map.entrySet()){
			System.out.println(entry.getKey() +" " + entry.getValue());
		}
	}
}
