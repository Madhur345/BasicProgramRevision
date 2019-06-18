import java.util.ArrayList;
import java.util.Iterator;

public class ChildArrayList {
	public static void main(String[] args) {
		ChildArray ca1 = new ChildArray(101, 27, "Vishal");
		ChildArray ca2 = new ChildArray(102, 28, "Neha");
		ChildArray ca3 = new ChildArray(103, 29, "Vivek");
		ArrayList<ChildArray>list = new ArrayList<>();
		list.add(ca1);
		list.add(ca2);
		list.add(ca3);
		Iterator<ChildArray> itr = list.iterator();
		while(itr.hasNext()){
			ChildArray child =(ChildArray)itr.next();
			System.out.println(child.id +" " + child.age +" " +child.name);
		}
		System.out.println("=====================");
		for(ChildArray child:list){
			System.out.println(child.id +" " + child.age +" " +child.name);
		}
	}
}
