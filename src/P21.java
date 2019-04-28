import java.util.Scanner;

public class P21 {
	public static void main(String[] args) {
		boolean flag = false;
		for(int i=0;i<3;i++){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the username");
			String username = s.nextLine();
			int l = username.length();
			if(l>=6 && l<=12){
				System.out.println("username is valid");
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("username is valid");
		}
		else{
			System.err.println("username is blocked");
		}
	}
}
