import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("ram");
		set.add("sam");
		set.add("tam");
		set.add("kam");
		for(String str :set){
			System.out.println(str);
		}
	}
}
