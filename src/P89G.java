
public class P89G extends P88F {
	int z =30;
	void sumbit(){
		System.out.println("execute sub class");
	}
	public static void main(String[] args) {
		P89G g = new P89G();
		g.disp();
		System.out.println(g.i);
		g.print();
		System.out.println(g.j);
		g.sumbit();
		System.out.println(g.z);
	}
}
