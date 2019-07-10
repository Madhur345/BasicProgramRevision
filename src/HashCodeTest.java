
public class HashCodeTest {
	public static void main(String[] args) {
		String t ="Square";
		System.out.println(t.hashCode());
		t =t.concat("Plums");
		System.out.println(t.hashCode());

		StringBuffer sb = new StringBuffer("Square");
		System.out.println(sb.hashCode());
		sb.append("Plums");
		System.out.println(sb.hashCode());
	}
}