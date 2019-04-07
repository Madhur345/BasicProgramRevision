import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ram");
		list.add("sam");
		list.add("tam");

		HashSet<String> set = new HashSet<>(list);
		set.add("raju");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string);
		}
	}
}
