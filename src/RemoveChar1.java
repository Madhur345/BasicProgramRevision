
public class RemoveChar1 {
	public static String removeChar(String str,int p){
		return str.substring(0,p)+ str.substring(p+1);
	}
	public static void main(String[] args) {
		String str ="I love my India";
		System.out.println(removeChar(str, 7));
	}
}
