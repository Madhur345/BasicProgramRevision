
public class StringSplit {
	public static void main(String[] args) {
		String str = "testing java selenium sql";
		String str1=" And Rest API";
		System.out.println(str.intern());
		System.out.println(str.concat(str1));
		System.out.println(str.isEmpty());
		String[] strr = str.split(" ");
		System.out.println(strr[0]);
		System.out.println(strr[1]);
		System.out.println(strr[2]);
		System.out.println(strr[3]);
		String[] strr1 = str.split("e");
		System.out.println(strr1[0]);
		System.out.println(strr1[1]);
		System.out.println(strr1[2]);
		System.out.println(strr1[3]);
	}
}
