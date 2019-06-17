
public class P81Car {
	String model;
	public P81Car(String model) {
		this.model=model;
	}
	public static void main(String[] args) {
		P81Car CAR = new P81Car("Swift");
		System.out.println(CAR.model);
		P81Car car = new P81Car("Grand I10");
		System.out.println(car.model);
	}  
}
