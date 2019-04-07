import java.util.Arrays;

public class AnagramString {
	public static void isAnagram(String str1,String str2){
		String s1 =str1.replaceAll(" ","");
		String s2 =str2.replaceAll(" ","");
		boolean status = true;
		if(s1.length()!=s2.length()){
			 status=false;
		}else{
			char[]Array1 =s1.toLowerCase().toCharArray();
			char[]Array2 = s2.toLowerCase().toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			 status =Arrays.equals(Array1, Array2);
		}
		if(status){
			System.out.println(s1 + " and " +s2 + " is Anagram");
		}else{
			System.out.println(s1 + " and " +s2 + " is not Anagram");
		}
	}
	public static void main(String[] args) {
		isAnagram("Keep", "Peek");
		isAnagram("Mother In Law", "Hitler Woman");
	}
}
