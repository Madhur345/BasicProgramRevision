
public class ConstF {
	int rolNum;
	String name;
	ConstF(int i,String str){
		rolNum =i;
		name = str;
	}
	public static void main(String[] args) {
		ConstF ce1 = new ConstF(10,"Ram");
		System.out.println(ce1.rolNum);
		System.out.println(ce1.name);
		ConstF ce2 = new ConstF(20,"Sam");
		System.out.println(ce2.rolNum);
		System.out.println(ce2.name);			
	}
}

