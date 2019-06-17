
public class P54Quiz {
	int a;
	int b;
	int add(int a,int b){
		this.a=a;
		this.b=b;
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		P54Quiz qz = new P54Quiz();
		System.out.println(qz.add(20, 30));
		System.out.println(new P54Quiz().add(10, 30));
		System.out.println(qz);
		System.out.println(new P54Quiz());
	}
}
