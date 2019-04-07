
public class StringCapitalize {
	public static String captilizeWord(String str){
		String words[] = str.split(" ");
		String capitilizeWord="";
		for(String w : words){
			String first=w.substring(0, 1);
			String afterFirst=w.substring(1);
			capitilizeWord+=first.toUpperCase()+afterFirst+ " ";
		}
		return capitilizeWord.trim();
	}
	public static void main(String[] args) {
		System.out.println(captilizeWord("my name is khan"));
		System.out.println(captilizeWord("and i am not a terrorist"));
	}
}