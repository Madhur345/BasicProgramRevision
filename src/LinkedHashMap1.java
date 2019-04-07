import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhp = new LinkedHashMap<>();
		lhp.put(101,"Vishal");
		lhp.put(102,"Rahul");
		lhp.put(103,"Vishal");
		System.out.println(lhp);
		for(Entry<Integer,String> entry:lhp.entrySet()){
			System.out.println(entry.getKey()+" "+ entry.getValue());
		}
	}
}
