import java.util.TreeSet;

public class TreeSetBook {
	public static void main(String[] args) {
		TreeSet<NoteBook> set= new TreeSet<NoteBook>();
		NoteBook b1 = new NoteBook(101, "Let us C", "ME", "Rajesh", 8);
		NoteBook b2 = new NoteBook(102, "Let us D", "MF", "Kajesh", 8);
		NoteBook b3 = new NoteBook(103, "Let us E", "MG", "Tajesh", 8);
		set.add(b1);
		set.add(b2);
		set.add(b3);
		for(NoteBook b5 : set){
			System.out.println(b5.id+" "+b5.name+" "+b5.publisher+" "+b5.author+" " +b5.quantity);
		}
	}
}
