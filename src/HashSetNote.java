import java.util.HashSet;

public class HashSetNote {
	public static void main(String[] args) {
		HashSet<Note> set = new HashSet<Note>();
		Note n1 = new Note(101,"Let Us C", "Made Easy", "Mukesh", 8);
		Note n2 = new Note(102,"Let Us D", "Made Hard", "Tukesh", 9);
		Note n3 = new Note(103,"Let Us E", "Made Tough", "Sukesh", 10);
		set.add(n1);
		set.add(n2);
		set.add(n3);
		for(Note n : set){
			System.out.println(n.id +" "+ n.name+" "+n.author+" " +n.publisher+" "+n.quantity);
		}
	}
}
