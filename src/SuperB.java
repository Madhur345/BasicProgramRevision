
public class SuperB extends SuperA {
	int i =20;
	void disp(){
		System.out.println("sub class variable");
		System.out.println(super.i);
		super.disp();
	}
	public static void main(String[] args) {
		SuperB b = new SuperB();
		System.out.println(b.i);
		b.disp();
	}
}
