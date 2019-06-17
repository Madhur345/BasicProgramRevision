
public class ExpectedArray {
	public static void main(String[] args) {
		String exp ="Vishal";
		int j=0;
		String[] str = {"Rahul","Tahul","Vishal","Gahul"};
		for(int i =0;i<str.length;i++){
			String act =str[i];
			if(exp.equals(act)){
				System.out.println("Expected data is available at " + i);
			}
			else {
				j++;
				if(j==str.length){
					System.out.println("Expected data is missing");
				}

			}
		}
	}
}
