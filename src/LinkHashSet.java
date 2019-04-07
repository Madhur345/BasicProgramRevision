import java.util.LinkedHashSet;

public class LinkHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("One");
		set.add("two");
		set.add("three");
		set.add("four");
		for(String str : set){
			System.out.println(str);
		}
	}
}
