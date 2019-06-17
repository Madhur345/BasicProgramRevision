import java.util.ArrayList;

public class ArrayListNew {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(1);
		list.add(null);
		list.add(true);
		list.add("Ram");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(2);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		list.clear();
		System.out.println(list);
		ArrayList<Object> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(null);
		list1.add(true);
		list1.add("Ram");
		list.addAll(list1);
		System.out.println(list);
	}
}
