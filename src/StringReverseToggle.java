
public class StringReverseToggle {

	public static String reverseToggle(String str){
		String words[] = str.split(" ");
		String reverseToggle ="";
		for(String w:words){
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			String first = sb.substring(0,1);
			String afterFirst =sb.substring(1);
			reverseToggle+=first.toLowerCase()+afterFirst.toUpperCase()+ " ";
		}
		return reverseToggle.trim();
	}
	public static void main(String[] args) {
		System.out.println(reverseToggle("my name is khan"));
		System.out.println(reverseToggle("and all khan are not terrorist"));
	}
}


