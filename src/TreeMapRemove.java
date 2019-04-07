
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapRemove { 
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(101, "Vishal");
		map.put(102, "Vivek");
		map.put(103, "Amit");
		System.out.println("Before Removing");
		for(Entry<Integer,String>entry:map.entrySet()){
			System.out.println(entry);
		}
		map.remove(102);
		System.out.println("After Removing");
		for(Entry<Integer,String>entry:map.entrySet()){
			System.out.println(entry);
		}
	}
}
