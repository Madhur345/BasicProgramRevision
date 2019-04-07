
public class CharacterPercentage {
	public static void charPercetage(String input){
		int totalChar = input.length();
		int uperCase =0;
		int lowerCase =0;
		int digits =0;
		int orthers =0;
		for(int i =0;i<totalChar;i++){
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)){
				uperCase++;
			}else if(Character.isLowerCase(ch)){
				lowerCase++;
			}else if(Character.isDigit(ch)){
				digits++;
			}else{
				orthers++;
			}
		}
		double uperCasePercentage = (uperCase*100)/totalChar;
		double lowerCasePercentage = (lowerCase*100)/totalChar;
		double digitCasePercentage = (digits*100)/totalChar;
		double ortherCasePercentage = (orthers*100)/totalChar;
		System.out.println("upercase letter are " + uperCasePercentage + " %");
		System.out.println("upercase letter are " + lowerCasePercentage + " %");
		System.out.println("upercase letter are " + digitCasePercentage + " %");
		System.out.println("upercase letter are " + ortherCasePercentage + " %");
	}
	public static void main(String[] args) {
		charPercetage("India is my country 100%");
	}
}