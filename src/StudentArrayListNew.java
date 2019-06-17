import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayListNew {

	public static void main(String[] args) {
		StudentArrayNew s1 = new StudentArrayNew(101, 17, "Ram");
		StudentArrayNew s2 = new StudentArrayNew(102, 18, "Ram");
		StudentArrayNew s3 = new StudentArrayNew(103, 19, "Ram");
		ArrayList<StudentArrayNew> list= new ArrayList<StudentArrayNew>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(StudentArrayNew st:list){
			System.out.println(st.rollNum + " " + st.age + " "+ st.name);
		}
		System.out.println("======================================");
		Iterator<StudentArrayNew> itr = list.iterator();
		while (itr.hasNext()) {
			StudentArrayNew st = (StudentArrayNew) itr.next();
			System.out.println(st.rollNum + " " + st.age + " "+ st.name);
		}
	}
}