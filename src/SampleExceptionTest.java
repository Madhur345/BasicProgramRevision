
public class SampleExceptionTest {
	static String str;
	public static void main(String[] args) {
		System.out.println(str.toString());
		try{
			int[]arr = new int[2];
			arr[1]=10;
			System.out.println(arr[1]);
			System.out.println(str.toString());
		}catch(Throwable t){
			System.out.println("exception handled");
		}
	}

}
