
public class StringToString {
	int rollNum,age;
	String name;
	public StringToString(int rollNum,int age,String name){
		this.rollNum =rollNum;
		this.age=age;
		this.name =name;
	}
	public String toString(){
		return rollNum + " " + age + " " + name;
	}
	public static void main(String[] args) {
		StringToString s1 = new StringToString(101, 20, "Vishal");
		StringToString s2 = new StringToString(102, 21, "Rahul");
		System.out.println(s1);
		System.out.println(s2);
	}
}
