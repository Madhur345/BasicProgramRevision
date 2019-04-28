
public class NonStatic {
	static void add(){
		System.out.println("add");
	}
	static void sub(){
		add();
	}
	public static void main(String[] args) {
		sub();
	}
}
