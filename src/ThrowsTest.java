import java.io.IOException;

public class ThrowsTest {
	static void m()throws IOException{
		throw new IOException("DEVICE ERROR");
	}
	static void n()throws IOException{
		
		m();
	}
	static void p(){
		try{
			n();
		}catch(Exception e){
			System.out.println("exception handled");
		}
	}
	public static void main(String[] args) {
		p();
		System.out.println("normal flow");
	}
}
