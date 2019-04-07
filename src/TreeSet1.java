import java.util.Iterator;
import java.util.TreeSet;;  
public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ram");
		set.add("Ajay");
		set.add("Vishal");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
