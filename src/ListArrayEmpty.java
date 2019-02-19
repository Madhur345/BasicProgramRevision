import java.util.ArrayList;

public class ListArrayEmpty {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Is array list empty : "+ list.isEmpty());
		list.add("Rahul");
		list.add("Vashnavi");
		list.add("Raj");
		System.out.println("After Insertion");
		System.out.println("Is array list empty : "+ list.isEmpty());
	}
}
