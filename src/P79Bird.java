
public class P79Bird {
	String type;
	double ht;
	public P79Bird() {
		this.type ="Flemingo";
		this.ht =5.5;
	}
	public static void main(String[] args) {
		P79Bird bird = new P79Bird();
		System.out.println(bird.type);
		System.out.println(bird.ht);
	}
}
