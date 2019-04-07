
public class StringImmutableProve {

	public static void refernceCheck(String x,String y){
		if(x==y){
			System.out.println("Both pointing to same refernce");
		}else{
			System.out.println("Both pointing to different reference");
		}
	}
	public static void main(String[] args) {
		String str1 ="Java";
		String str2 ="Java";
		System.out.println("before modification  in str1");
		refernceCheck(str1, str2);
		str1 += "Selenium";
		System.out.println("after modification  in str1");
		refernceCheck(str1, str2);
	}
}