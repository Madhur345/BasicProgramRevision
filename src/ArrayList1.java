import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		//ArrayList  list = new ArrayList<>();
		System.out.println(list);
		list.add(1);
		list.add("pass");
		list.add(true);
		list.add(10.2);
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println("====display the content of array list===");
		for(int i =0; i < list.size();i++){
			System.out.println(list.get(i));
		}
		list.clear();
		System.out.println("====display the content of array list after removing data===");
		System.out.println(list);
	}
}
