import java.util.TreeMap;

public class TreeMapNavigable {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(101, "Vishal");
		map.put(102, "Vivek");
		map.put(103, "Amit");
		map.put(104, "Rakesh");
		System.out.println(map);
		System.out.println("Descending Order" +  map.descendingMap());
		System.out.println("headmap" +  map.headMap(102, true));
		System.out.println("tail map" +  map.tailMap(102, true));
		System.out.println("sub map" +  map.subMap(101,false, 103,true));
}
}
