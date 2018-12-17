
public class P48Employee {
	final static String COMPNAME ="SquarePlums";
	int empId;
	String empName;
	long empMobNum;
	double empSal;
	public static void main(String[] args) {
		P48Employee emp1 =new P48Employee();
		System.out.println(P48Employee.COMPNAME);
		System.out.println("Display First Employee Info");
		System.out.println(emp1.empId=1001);
		System.out.println(emp1.empName="Vishal");
		System.out.println(emp1.empMobNum=9206384048L);
		System.out.println(emp1.empSal=30000.00);
		P48Employee emp2 =new P48Employee();
		System.out.println("Display Second Employee Info");
		System.out.println(P48Employee.COMPNAME);
		System.out.println(emp2.empId=1002);
		System.out.println(emp2.empName="Pratyush");
		System.out.println(emp2.empMobNum=9927282828L);
		System.out.println(emp2.empSal=20000.00);
	}
}
