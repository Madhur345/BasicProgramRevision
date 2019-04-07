import java.util.Hashtable;

public class HashTableGetOrDefault {
	public static void main(String[] args) {
		Hashtable<Integer,String> table = new Hashtable<>();
		table.put(101, "Ram");
		table.put(102, "Sam");
		table.put(103,"Tam");
		System.out.println(table.getOrDefault(102 ,"Not Found"));
		System.out.println(table.getOrDefault(105 ,"Not Found"));
	}
}
