
public class P59Person {
	void eat(Fruit f){
		System.out.println("Fruit is sweet");
	}
	public static void main(String[] args) {
		P59Person p = new P59Person();
		p.eat(new Fruit());
		p.eat(null);
		Fruit ft = new Fruit();
		p.eat(ft);
	}
}
