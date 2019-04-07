import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapNote {
	public static void main(String[] args) {
		HashMap<Integer, Note> map = new HashMap<Integer,Note>();
		Note n1 = new Note(101,"Let Us C", "Made Easy", "Mukesh", 8);
		Note n2 = new Note(102,"Let Us D", "Made Hard", "Tukesh", 9);
		Note n3 = new Note(103,"Let Us E", "Made Tough", "Sukesh", 10);
		map.put(1, n1);
		map.put(2, n2);
		map.put(3, n3);
		
		for(Entry <Integer,Note> entry :map.entrySet()){
			int key =entry.getKey();
			Note b = entry.getValue();
			System.out.println(key + "Details :");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		}
	}
}