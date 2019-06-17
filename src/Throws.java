import java.io.IOException;

public class Throws {
	static void meth() throws 	ArithmeticException,IOException,ClassNotFoundException {
		int i =10;
		int z = 0;
		int k = i/z;
		System.out.println(k);
	}
	public static void main(String[] args) { 
		try{
			meth();
		}catch(ArithmeticException a){
			System.out.println("ArithmeticException");
		}catch(IOException i){
			System.out.println("IOException");
		}catch(ClassNotFoundException c){
			System.out.println("ClassNotFoundException");
		}
	}
}
