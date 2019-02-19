
public class ThrowableTest {
	static String str;
	public static void main(String[] args) {
		
		try {
			System.out.println(str.toString());
			int []arr = new int[1];
			arr [1]=10;
		}catch (Throwable t){
			System.out.println("Exception Handled");
		}
	}
}
