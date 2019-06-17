
public class JavaStatic {
	static int num;
	static String myst;
	static{
		System.out.println("Block 1");
		num =100;
		myst ="100 centuries is in the name of Sachin";
	}
	static{
		System.out.println("Block 2");
		num =120;
		myst ="120 centuries is in the name of Kohli";
	}
	public static void main(String[] args) {
		System.out.println("value of num = " + num);
		System.out.println("Value of myst = " + myst);
	}
}
