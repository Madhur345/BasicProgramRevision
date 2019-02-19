
import java.util.ArrayList;

public class ArrayListForeachLoop {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Sam");
		list.add("Tam");
		for(String str : list){
			System.out.println(str);
		}
	}
}


