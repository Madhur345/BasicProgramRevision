
public class P74ConstCustomer {
	String name;
	String desc;
	P74ConstCustomer(String str1,String str2) {
		name = str1;
		desc = str2;
	}

	P74ConstCustomer(String str3) {
		name = str3;
	}
	public static void main(String[] args) {
		P74ConstCustomer cus1= new P74ConstCustomer("Axis","National Bank");
		System.out.println(cus1.name);
		System.out.println(cus1.desc);
		P74ConstCustomer cus2 = new P74ConstCustomer("SBI");
		System.out.println(cus2.name);
	}
}
