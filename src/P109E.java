
public class P109E {
	public P109E() {
		System.out.println("Class E default constructor");
	}
}
class P110F extends P109E{
	public P110F() {
		super();
		System.out.println("Class F default Constructor");
	}
}
