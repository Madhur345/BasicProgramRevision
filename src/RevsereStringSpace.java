
public class RevsereStringSpace {
	public static void main(String args[]) {
		String str = "India Is my country";
		String strArray[] = str.split(" ");
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		for(int i=0 ; i<str.length(); i++){
			if(str.charAt(i)== ' '){
				sb.insert(i, " ");
			}
		}
		StringBuffer str2=sb.append(" ");
		System.out.println(str2);
	}
}