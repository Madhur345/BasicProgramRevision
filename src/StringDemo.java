
public class StringDemo {

	public static void countWords(String string){
		String strArr [] = string.split("\\s");
		int count = 0;
		for (String str: strArr) {
			if(!str.isEmpty()){
				count++;
				System.out.println(str);
			}
		}
		System.out.println(count);


	}
	public static void main(String[] args) {
		countWords("     I love my      India");
	}
}
