
public class AbstractChild extends AbstractParent {
	public AbstractChild(){
		super(10,34.5);
		System.out.println("Print Child Constructor");
	}
	public static void main(String[] args) {
		AbstractParent c = new AbstractChild();
		AbstractChild c1 = new AbstractChild();
	}
}
