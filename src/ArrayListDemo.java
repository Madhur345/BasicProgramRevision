import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrlist1 =new ArrayList<Integer>();
		arrlist1.add(25);
		arrlist1.add(30);
		arrlist1.add(35);
		System.out.println("Printing list 1");
		for (int i =0; i<arrlist1.size(); i++){
			System.out.println(arrlist1.get(i));
		}
		ArrayList<Integer> arrlist2 =new ArrayList<Integer>();
		arrlist2.add(40);
		arrlist2.add(45);
		arrlist2.add(50);
		System.out.println("Printing list 2");
		for (int i =0; i<arrlist2.size(); i++){
			System.out.println(arrlist2.get(i));
		}
		arrlist1.addAll(arrlist2);
		System.out.println("Printing all the elements");
		for (int i =0; i<arrlist1.size(); i++){
			System.out.println(arrlist1.get(i));
		}
	}
}