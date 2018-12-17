
public class P54Quiz {
	int a;
	int b;
	int add(int a,int b){
		int sum=a+b;
		this.a=a;
		this.b=b;
		return sum;
	}
	public static void main(String[] args) {
		P54Quiz qz = new P54Quiz();
		System.out.println(qz.add(20, 30));
		System.out.println(new P54Quiz().add(10, 30));
	}
}
