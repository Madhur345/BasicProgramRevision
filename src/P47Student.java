
public class P47Student {
	final static String INSTNAME="Qspiders";
	String stdName;
	int rollNum;
	double stdFees;
	public static void main(String[] args) {
		P47Student s1 = new P47Student();
		s1.stdName="Vishal";
		s1.rollNum=345;
		s1.stdFees=11500.00;
		System.out.println("Display First Student Info");
		System.out.println("Name - "+s1.stdName);
		System.out.println("Roll No. - "+s1.rollNum);
		System.out.println("Fees - "+s1.stdFees);
		System.out.println("=======================");
		P47Student s2 = new P47Student();
		s2.stdName="Seema";
		s2.rollNum=350;
		s2.stdFees=9500.00;
		System.out.println("Display Second Student Info");
		System.out.println("Name -  "+s2.stdName);
		System.out.println("Roll No. -  "+s2.rollNum);
		System.out.println("Fees - "+s2.stdFees);
	}

}
