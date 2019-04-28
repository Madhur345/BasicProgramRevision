
public class P65Person {
	void eat(Pizza p1){
		System.out.println("persons eats pizza");
	}
	public static void main(String[] args) { 
		P65Person p = new P65Person();
		Pizza p2 = new Pizza();
		p.eat(p2);
	}
}
