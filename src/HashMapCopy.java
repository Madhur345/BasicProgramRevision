import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapCopy {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Copy> map = new LinkedHashMap<>();
		Copy c1 = new Copy(101, "Wisdom", "KL Rahul","Cricket is Life", 500);
		Copy c2 = new Copy(102, "Cricket Sagar", "Rahul Dravid","Cricket is Everthing", 1000);
		Copy c3 = new Copy(103, "Cric Buzz", "Schin Tendulkar","Cricket is Universe", 1500);
		map.put(1, c1);
		map.put(2,c2);
		map.put(3,c3);
		for(Entry<Integer,Copy>entry:map.entrySet()){
			int key = entry.getKey();
			Copy c = entry.getValue();
			System.out.println("Key Details" +" " +key);
			System.out.println(c.id+" "+c.author + " " +c.name +" " +c.publisher + " "+c.quantity);
		}
	}
}
