
public class JavaSingleStatic {
	static int num;
	static String alph;
	static{
		num =101;
		alph ="ABCD";
	}
	public static void main(String[] args) {
		System.out.println("numer value = " + num);
		System.out.println("alphabate value = " + alph);
	}
}
