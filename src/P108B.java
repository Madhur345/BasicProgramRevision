
public class P108B extends P107A {
	int i =20;
	void disp(){
		System.out.println(super.i);
		super.disp();
	}
	public static void main(String[] args) {
		P108B b = new P108B();
		System.out.println(b.i);
		b.disp();
	}
}
