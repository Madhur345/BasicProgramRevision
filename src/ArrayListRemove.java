import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListRemove {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ravi");
		list.add("tavi");
		list.add("mavi");
		list.add("javi");
		list.remove(0);
		list.remove("tavi");
		System.out.println(list);
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("kavi");
		list1.add("ravi");
		list1.add("pavi");
		list.addAll(list1);
		System.out.println(list);
		list.removeAll(list1);
		System.out.println(list);
		list1.removeIf(str -> str.contains("pavi"));//lambda expression
		System.out.println(list1);
		list.clear();
		System.out.println(list);
	}
}
