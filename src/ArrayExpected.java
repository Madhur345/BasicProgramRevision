
public class ArrayExpected {

	public static void main(String[] args) {
		String exp ="Tami";
		int j =0;
		String [] str = new String[5];
		str [0] ="Ram";
		str [1] ="Sam";
		str [2] ="Tam";
		str [3] ="Ran";
		str [4] ="Jan";
		System.out.println("Length of Array = " +str.length);
		for (int i =0;i<str.length;i++){
			String act = str[i];
			if(exp.equals(act)){
				System.out.println("Expected Data is Availabe");
				break;
			}
			else{
				j++;
				if(j==str.length){
					System.out.println("Expected Data is Missing");
				}
			}
		}
	}
}
