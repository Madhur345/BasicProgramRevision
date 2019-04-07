import java.util.HashMap;

public class HashMapAdd {
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
		HashMap<Integer, String> map1 = new HashMap<Integer,String>();
		map1.put(50, "Ram");
		map1.put(60,"Sam");
		map1.put(70, "Tam");
		map1.putAll(map);
		System.out.println("After Invoking putAll method");	
		System.out.println(map1);
	}
}
