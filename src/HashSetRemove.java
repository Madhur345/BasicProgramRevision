import java.util.HashSet;

public class HashSetRemove {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("ram");
		set.add("sam");
		set.add("tam");
		set.add("kam");
		System.out.println(set);
		set.remove("sam");
		System.out.println(set);
		HashSet<String> set1 = new HashSet<>();
		set1.add("raju");
		set1.add("saju");
		set1.add("taju");
		set1.add("kaju");
		System.out.println(set1);
		set.addAll(set1);
		System.out.println(set);
		set.removeAll(set1);
		for(String str : set){
			System.out.println(str);
		}
	}
}