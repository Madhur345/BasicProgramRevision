
public class StudentToString {
	int rollNum;
	String name;
	String city;

	public StudentToString(int rollNum,String name,String city) {
		this.rollNum =rollNum;
		this.name =name;
		this.city=city;
	}
	public String toString(){
		return rollNum+" "+name+" "+" "+city;
	}
	public static void main(String[] args) {
		StudentToString s1 = new StudentToString(101, "Vishal", "Bangalore");
		StudentToString s2 = new StudentToString(105, "Vivek","Ranchi");
		System.out.println(s1);
		System.out.println(s2);
	}
}
