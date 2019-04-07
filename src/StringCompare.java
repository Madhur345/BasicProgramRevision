
public class StringCompare {
	public static void main(String[] args) {
		String str = "Sachin";
		String str1 ="sachin";
		String str4 ="Ratan";
		String str5 ="Lakhan";
		String str2 = new String("Sach");
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str1==str2);
		System.out.println(str.compareTo(str2));
		System.out.println(str4.compareTo(str5));
		System.out.println(str.compareToIgnoreCase(str1));
	}
}
