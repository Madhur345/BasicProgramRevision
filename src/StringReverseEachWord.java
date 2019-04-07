
public class StringReverseEachWord {
	public static String reverseEachWord(String str){
		String words[] = str.split(" ");
		String reverseEachWord ="";
		for(String w:words){
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseEachWord+=sb.toString() + " ";
		}
		return reverseEachWord.trim();
	}
	public static void main(String[] args) {
		System.out.println(reverseEachWord("my name is khan"));
		System.out.println(reverseEachWord("and all khan are not terriorist"));
	}
}
