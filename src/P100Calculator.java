
public class P100Calculator {
	void add(int i,int j){
		int z = i+j;
		System.out.println(z);
	}
	void add(float i,float j){
		float z = i+j;
		System.out.println(z);
	}
	public static void main(String[] args) {
		P100Calculator cal = new P100Calculator();
		cal.add(10, 20);
		cal.add(10.5f, 11.5f);
	}
}
