import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sam");
		list.add("Tam");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
	}
}
