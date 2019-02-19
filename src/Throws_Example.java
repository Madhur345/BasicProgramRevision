
public class Throws_Example {
	public static void main(String[] args) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		try{
			int i =0;
			int j =1;
			int k =j/i;
			System.out.println(k);

		}catch(ArithmeticException ae){
			System.out.println("Can't Devide any number by zero");
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ai){
		}
	}
}
