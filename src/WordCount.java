public class WordCount {  
	public static void wordCount(String str){
		String[] words = str.split(" ");
		int count =0;
		for(String str1:words){
			//if(!str1.trim().equals(""))
			if(!str1.trim().isEmpty()){
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		wordCount(" I love   my India   ");
	}
}  