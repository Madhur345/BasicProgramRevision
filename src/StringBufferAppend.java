
public class StringBufferAppend {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java ");
		System.out.println(sb);
		sb.insert(1, "Jpider");
		System.out.println(sb);
		sb.replace(1, 5, "S");
		System.out.println(sb);
		sb.delete(1, 4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
