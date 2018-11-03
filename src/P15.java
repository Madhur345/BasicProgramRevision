import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day");
		int dayNum = s.nextInt();
		switch (dayNum) {
		case 1:
			System.out.println("Day Is Monday");
			break;
		case 2:
			System.out.println("Day Is Tuesday");
			break;
		case 3:
			System.out.println("Day Is Wednesday");
			break;
		case 4:
			System.out.println("Day Is Thrusday");
			break;
		case 5:
			System.out.println("Day Is Friday");
			break;
		case 6:
			System.out.println("Day Is Saturday");
			break;
		case 7:
			System.out.println("Day Is Sunday");
			break;

		default:
			System.err.println("Day is Invalid");
			break;
		}
	}

}
