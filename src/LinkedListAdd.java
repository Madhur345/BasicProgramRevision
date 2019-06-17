import java.util.LinkedList;

public class LinkedListAdd {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("raju");
		list1.add("samu");
		list1.add("tamu");
		System.out.println(list1);
		list1.add(0, "rahul");
		System.out.println(list1);
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("kaju");
		list2.add("mamu");
		list2.add("jamu");
		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1);
		LinkedList<String> list3 = new LinkedList<>();
		list3.add("huji");
		list3.add("tumi");
		list3.add("kuti");
		System.out.println(list3);
		list1.addAll(2,list3);
		System.out.println(list1);
		list1.addFirst("Rakesh");
		list1.addLast("Suresh");
		System.out.println(list1);
	}
}
