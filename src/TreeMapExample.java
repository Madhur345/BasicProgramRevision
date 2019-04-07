import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(101, "Vishal");
		map.put(102, "Vishal");
		map.put(103, "Vishal");
		for(Entry<Integer,String>entry:map.entrySet()){
			System.out.println(entry);
		}
	}
}
