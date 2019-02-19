
public class ArrayNew {
	public static void main(String[] args) {
		String [] str = new String[5];
		str [0] ="Ram";
		str [1] ="Sam";
		str [2] ="Tam";
		str [3] ="Ran";
		str [4] ="Jan";
		System.out.println("Length of Array = " +str.length);
		for (int i =0;i<str.length;i++){
			System.out.println(str[i]);
		}
	}
}
