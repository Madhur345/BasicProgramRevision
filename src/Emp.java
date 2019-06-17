
public class Emp {
	int id;
	String name;
	Address address;
	Emp(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address =address;
	}
	void disp(){
		System.out.println(id + " " + name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	public static void main(String[] args) {
		Address address1= new Address("Lohardaga", "Jharkhand", "India");
		Emp e1 = new Emp(101, "Vishal", address1);
		e1.disp();
	}
}
