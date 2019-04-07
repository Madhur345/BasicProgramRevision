
public class StringReverse {
	public static String isReverse(String str) {
		StringBuilder sb=new StringBuilder(str);  
		sb.reverse();
		return sb.toString();
	}  
	public static void main(String[] args) {
		System.out.println(isReverse("Qspider Testing Institute"));
		System.out.println(isReverse("Jspider Coding Institute"));
	}
}  

