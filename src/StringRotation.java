
public class StringRotation {
	public static boolean rotationString(String str1, String str2){
		if(str1.length()!=str2.length()){
			return false;
		}
		String str3 =str1 +str1;
		if(str3.contains(str2)){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		String str1 ="JavaProgrammer";
		String str2 ="ProgrammerJava";
		if(rotationString(str1, str2)){
			System.out.println(str1+" is rotation of " +str2);
		}else{
			System.out.println(str1+" is not rotation of " +str2);
		}
	}
}
