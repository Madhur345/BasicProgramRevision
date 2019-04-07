import java.util.HashMap;

public class HashMapReplace {
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
		map.replace(10, "Rahul");
		System.out.println(map);
		map.replace(20, "Tuhul");
		System.out.println(map);
		map.replace(10, "suhul");
		System.out.println(map);
	}
}
