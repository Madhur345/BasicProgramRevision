import java.util.LinkedHashMap;

public class LinkedHashRemove {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
		map.put(101, "Ram");
		map.put(102,"Suresh");
		map.put(104,"Rakesh");
		System.out.println(map);
		map.remove(101);
		System.out.println(map);
	}
}
