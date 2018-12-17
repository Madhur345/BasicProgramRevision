
public class P41Car {
	final String MODEL ="Grand I10";
	String color;
	int price = 550000;
	public static void main(String[] args) {
		P41Car c = new  P41Car();
		c.color ="Gray";
		c.price =600000;
		//c.MODEL="Grant I10 AT";
		System.out.println(c.MODEL);
		System.out.println(c.color);
		System.out.println(c.price);
	}
}
