import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("raju");
		list.add("samu");
		list.add("huju");
		Iterator<String> itr = list.descendingIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
