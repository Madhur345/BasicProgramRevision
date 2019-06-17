
public class UncheckedExpection {
	public static void main(String[] args) {
		try{
			int [] num ={1,2,3,4,5,6};
			System.out.println(num[6]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception Handled");
			e.printStackTrace();
		}
	}
}