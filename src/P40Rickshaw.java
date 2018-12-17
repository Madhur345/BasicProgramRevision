
public class P40Rickshaw {
	String color ="Yellow-Green";
	String regNo;
	int noOfWheels;
	public static void main(String[] args) {
		P40Rickshaw r1 = new P40Rickshaw();
		r1.regNo ="JH087569";
		r1.noOfWheels=3;
		System.out.println(r1);
		System.out.println(r1.color);
		System.out.println(r1.regNo);
		System.out.println(r1.noOfWheels);
		P40Rickshaw r2 = new P40Rickshaw();
		System.out.println("-------------------");
		System.out.println(r2);
		System.out.println(r2.color);
		System.out.println(r2.regNo);
		System.out.println(r2.noOfWheels);

	}
}
