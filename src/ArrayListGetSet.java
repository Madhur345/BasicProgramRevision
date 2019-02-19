import java.util.ArrayList;

public class ArrayListGetSet {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ravi");
		list.add("mavi");
		list.add("tavi");
		System.out.println("Before update : "+list.get(1));
		list.set(1, "javi");
		System.out.println("After update : "+list.get(1));
	}
}
