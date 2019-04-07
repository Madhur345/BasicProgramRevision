import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("sam");
		list1.add("monisha");
		System.out.println(list1);
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(101);
		list2.add(102);
		System.out.println(list2);
	}
}
