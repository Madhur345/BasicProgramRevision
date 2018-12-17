
public class P73ConstE {
	int rolNum;
	String name;
	P73ConstE(int rolNum,String name){
		this.rolNum =rolNum;
		this.name = name;
	}
	public static void main(String[] args) {
		P73ConstE ce1 = new P73ConstE(10,"Ram");
		System.out.println(ce1.rolNum);
		System.out.println(ce1.name);
		P73ConstE ce2 = new P73ConstE(20,"Sam");
		System.out.println(ce2.rolNum);
		System.out.println(ce2.name);			
	}

}
