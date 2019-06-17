
public class StringBufferAppendNew {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Java");
		System.out.println(sb);
		sb.insert(1, "Jpider");
		System.out.println(sb);
		sb.replace(1, 5, "s");
		System.out.println(sb);
		sb.delete(1, 4);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
