import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {
	public static void main(String[] args) {
		StudentArray s1 = new StudentArray(101, 15, "Skisha");
		StudentArray s2 = new StudentArray(102, 16, "Aditi");
		StudentArray s3 = new StudentArray(103, 17, "Vishal");
		ArrayList<StudentArray> list =new ArrayList<StudentArray>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
//		Iterator<StudentArray> itr = list.iterator();
//		while(itr.hasNext()){
//			StudentArray st = (StudentArray)itr.next();
//			System.out.println(st.rollNum + " " + st.name+" " +st.age);
//		}
		for(StudentArray st:list){
			System.out.println(st.rollNum + " " + st.name+" " +st.age);
		}
	}
}
