
public class P84Constructor {
	public P84Constructor() {
		System.out.println("Default Constructor");
	}
	P84Constructor(int i){
		//P84Constructor(10); Can not call orther constructor by name
		System.out.println("Single param integer Constructor");
	}
	P84Constructor(String s){
		this(true,50.5);
		System.out.println("Single param string Constructor");
	}
	P84Constructor(boolean b,double d){
		this(10);
		//this("Guddu");//Calling Recurring of constructor is not possible and also can't call more than one CONSTRUCTOR

		System.out.println("Double Param Constructor");
	}
	public static void main(String[] args) {
		P84Constructor constructor = new P84Constructor("Seema");
	}
}
