
public class NoteBook implements Comparable<NoteBook> {
	int id,quantity;
	String name,author,publisher;

	public NoteBook(int id,String name, String author,String publisher,int quantity) {
		this.id =id;
		this.name=name;
		this.author =author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	public int compareTo(NoteBook b5){
		if(id>b5.id){
			return 1;
		}else if(id < b5.id){
			return -1;
		}else{
			return 0;
		}
	}
}
