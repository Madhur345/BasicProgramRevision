
public class P80Baby {
	String name,gender,color;
	public P80Baby(String g,String c) {
		this.gender=g;
		this.color=c;
	}
	public static void main(String[] args) {
		P80Baby baby = new P80Baby("Female","Fair");
		System.out.println(baby.name);
		System.out.println(baby.gender);
		System.out.println(baby.color);
		System.out.println(baby.name="Aravai");
	}

}
