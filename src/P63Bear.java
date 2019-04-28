
public class P63Bear {
	static void drink(P63Bear b){
		System.out.println(b);
	}
	public static void main(String[] args) {
		P63Bear b1 = new P63Bear();
		P63Bear b2 = b1;
		
		drink(b1);
		System.out.println(b1);
		System.out.println(b2);
	}
}
