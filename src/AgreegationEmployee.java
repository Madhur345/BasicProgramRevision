
public class AgreegationEmployee {
	int id;
	String name;
	AgrregrationAddress address;
	public AgreegationEmployee(int id,String name,AgrregrationAddress address) {
		this.id =id;
		this.name= name;
		this.address =address;
	}
	void disp(){
		System.out.println(id + " " + name);
		System.out.println(address.city + " " +address.state+ " "+ address.country);
	}
	public static void main(String[] args) {
		AgrregrationAddress address1 = new AgrregrationAddress("Lohardaga", "Jharkhand","India");
		AgreegationEmployee e1 = new AgreegationEmployee(305, "Vishal", address1);
		e1.disp();
	}
}
