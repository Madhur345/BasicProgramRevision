import java.util.Scanner;

public class P18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String Data");
		String data = s.nextLine();
		System.out.println(data);
		System.out.println(data.length());
		s.close();
	}
}
