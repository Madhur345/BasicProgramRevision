import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int dayNum = s.nextInt();
		switch (dayNum) {
		case 1:
			System.out.println("Day is Monday");
			break;
		case 2:
			System.out.println("Day is Tuesday");
			break;
		case 3:
			System.out.println("Day is Wednesday");
			break;
		case 4:
			System.out.println("Day is Thrusday");
			break;
		case 5:
			System.out.println("Day is Friday");
			break;
		case 6:
			System.out.println("Day is Saturday");
			break;
		case 7:
			System.out.println("Day is Sunmday");
			break;
		default :
			System.out.println("Day is Invalid");
		}
	}
}
