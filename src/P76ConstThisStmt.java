
public class P76ConstThisStmt {
	int rolNum;
	String name;
	public P76ConstThisStmt() {
		this(10);
		System.out.println("execute default constructor");
	}
	P76ConstThisStmt(int i){
		System.out.println("execute single paramter constructor");
	}
	public static void main(String[] args) {
		System.out.println("main methods starts");
		P76ConstThisStmt thisstm =new P76ConstThisStmt();
		System.out.println(thisstm.name="Vishal");
		System.out.println(thisstm.rolNum=345);
		System.out.println("main methods ends");
	}
}
