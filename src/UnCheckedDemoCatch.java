
public class UnCheckedDemoCatch {
	public static void main(String[] args) {
		try{
			int [] num = new int[5];
			System.out.println(num[6]);
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Exception Handled");
			ae.printStackTrace();
		}
	}
}