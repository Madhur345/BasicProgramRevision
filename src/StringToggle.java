
public class StringToggle {
	public static String stringToggle(String str){
		String words[] = str.split(" ");
		String toggle ="";
		for(String w:words){
			String first = w.substring(0,1);
			String afterFirst =w.substring(1);
			toggle+=first.toLowerCase()+afterFirst.toUpperCase()+ " ";
		}
		return toggle.trim();
	}
	public static void main(String[] args) {
		System.out.println(stringToggle("my name is khan"));
		System.out.println(stringToggle("and all khan are not terrorist"));
	}
}
