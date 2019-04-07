import java.util.TreeSet;

public class TressSetHieghestLowest {
	public static void main(String[] args) {
		TreeSet<Integer>set = new TreeSet<>();
		set.add(25);
		set.add(15);
		set.add(60);
		set.add(30);
		System.out.println("Lowest value :"+ set.pollFirst());
		System.out.println("Hieghest value :"+ set.pollLast());
		for(Integer in :set){
			System.out.println(in);
		}
	}
}
