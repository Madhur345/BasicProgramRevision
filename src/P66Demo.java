
public class P66Demo {
	void math(){
		System.out.println("sum");
		math();
	}
	public static void main(String[] args) {
		new P66Demo().math();
	}
}
