import java.util.HashMap;

public class HashMapRemove {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(10, "Ram");
		map.put(20,"Sam");
		map.put(30, "Tam");
		System.out.println("After Invoking put method");
		System.out.println(map);
		map.putIfAbsent(40,"Raj");
		System.out.println("After Invoking putIfAbsent method");
		System.out.println(map);
		map.remove(10);
		System.out.println(map);
		map.remove(20);
		System.out.println(map);
		map.remove(40,"Raj");
		System.out.println(map);
	}
}
