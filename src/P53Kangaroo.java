
public class P53Kangaroo {
	double height =5.2;
	public void jump(){
		double height =3.6;
		System.out.println("height of the kangaoor is " +this.height);
		System.out.println("height of the kangaoor is " +height);
		this.sleep();
	}
	public void sleep(){
		System.out.println("Kangaroo sleep");
	}
	public static void main(String[] args) {
		P53Kangaroo k = new P53Kangaroo();
		k.jump();
		//this.jump();
	}
}
