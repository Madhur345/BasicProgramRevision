import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Kam");
		list.add("Tam");
		System.out.println("====Using Iterator Interface====");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("====Using for loop====");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("====Using forEach loop====");
		for(String str:list){
			System.out.println(str);
		}
	}
}
