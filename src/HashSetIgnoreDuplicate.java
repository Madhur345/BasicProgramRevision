import java.util.HashSet;
import java.util.Iterator;

public class HashSetIgnoreDuplicate {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("ram");
		set.add("sam");
		set.add("tam");
		set.add("ram");
		Iterator<String> itr =set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}