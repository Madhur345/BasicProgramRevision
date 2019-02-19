import java.io.IOException;

public class ThrowsAndThrow {
	void bat() throws IOException{
		throw new IOException("Game Error");
	}
	void ball() throws IOException{
		bat();
	}
	void cricket(){
		try{
			ball();
		}catch(Exception e){
			System.out.println("Exception Handled");
		}
	}
	public static void main(String[] args) {
		ThrowsAndThrow tt = new ThrowsAndThrow();
		tt.cricket();
		System.out.println("normal flow");
	}
}
