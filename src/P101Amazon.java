
public class P101Amazon {
	void search(int prodId){
		System.out.println("Display mobile info");
	}
	void search(String prodName){
		System.out.println("Display mobile info");
	}
	void search(int prodId,String prodName){
		System.out.println("Display mobile info");
	}
	public static void main(String[] args) {
		P101Amazon amazon = new P101Amazon();
		amazon.search(101);
		amazon.search("Honor 7X");
		amazon.search(101,"7X");
	}
}
