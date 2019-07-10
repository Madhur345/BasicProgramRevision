
public class StringToInt {
	public static void main(String[] args) {
		String str ="200";
		String str1 ="Hello";
		int i = Integer.parseInt(str);
		int k = Integer.valueOf(str);
		System.out.println(i);
		System.out.println(k);
		System.out.println(str+100);
		System.out.println(i+100);
	}
}
