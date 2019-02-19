import java.util.ArrayList;
public class ArrayListForLoop {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sam");
		list.add("Tam");
		for(int i=0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}

