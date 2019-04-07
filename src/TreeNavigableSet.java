import java.util.TreeSet;

public class TreeNavigableSet {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		System.out.println("Intial set : " +set);
		System.out.println("Reverse set : " +set.descendingSet());
		System.out.println("Head Set : "+set.headSet("C",true));
		System.out.println("Sub set : " +set.subSet("A",false,"E",true));
		System.out.println("Tail Set : " +set.tailSet("C",false));
	}
}
