
public class P32 {
	public static void main(String[] args) {
		System.out.println("mme starts");
		System.out.println(add(10,20));
		sub(20,10);
		mul(12,10);
		div(20,5);
		System.out.println("mme ends");
	}
	static int add(int i,int j){
		int z =i+j;
		return z;
	}
	static int sub(int i,int j){
		int z =i-j;
		System.out.println(z);
		return z;
	}
	static int mul(int i,int j){
		int k =i*j;
		System.out.println(k);
		return k;
	}
	static int div(int i,int j){
		int z =i/j;
		System.out.println(z);
		return z;
	}
}