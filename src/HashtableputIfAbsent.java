
import java.util.Hashtable;

public class HashtableputIfAbsent {
	public static void main(String[] args) {
		Hashtable<Integer,String> table = new Hashtable<>();
		table.put(101, "Ram");
		table.put(102, "Sam");
		table.put(103,"Tam");
		System.out.println("Intial map : " +table);	
		table.putIfAbsent(104, "Kam");
		System.out.println("Updated map : " +table);
		table.putIfAbsent(102, "Sam");
		System.out.println("Updated map : " +table);
	}
}
