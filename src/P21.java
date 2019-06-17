import java.util.Scanner;

public class P21 {
	public static void main(String[] args) {
		boolean flag = false;
		for(int i=0;i<3;i++){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the username");
			String userName = s.nextLine();
			int l = userName.length();
			if(l>=6 && l<=12){
				flag = true;
				break;
			}
		}
			if(flag){
				System.out.println("Welcome to Kotak Mahindra Bank");
			}
			else{
				System.err.println("Username is Blocked");
			}

		}

	}
