
import java.util.LinkedHashMap;

public class HashKeyValue {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhp = new LinkedHashMap<>();
		lhp.put(101,"Vishal");
		lhp.put(102,"Rahul");
		lhp.put(103,"Vishal");
		System.out.println("key" +lhp.keySet());
		System.out.println("values" +lhp.values());
		System.out.println("keyset" +lhp.entrySet());
	}
}


