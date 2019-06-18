import java.util.HashMap;
import java.util.Map.Entry;

public class MapBookDetails {
	public static void main(String[] args) {
		HashMap<Integer, BookDetails> map = new HashMap<>();
		BookDetails b1 = new BookDetails("Rich Dad Poor Dad", "Robert Kiyosaki", 10);
		BookDetails b2 = new BookDetails("3 Idiots", "Chetan Bhagat", 15);
		BookDetails b3 = new BookDetails("How to Win Friends and Influence People", "Dale Carnegie", 20);
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		for(Entry<Integer, BookDetails> entry :map.entrySet()){
			int key =entry.getKey();
			BookDetails b = entry.getValue();
			System.out.println(key + " Details");
			System.out.println("Book Name = "+b.name+", Auther Name = " +b.auther+", Quantity Required = " +b.quantity);
		}
	}
}
