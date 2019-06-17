
public class StringBufferPerformance {
	public static String concatWithString(){
		String t = "Square";
		for(int i =0;i<10000;i++){
			t = t + "Plums";
		}
		return t;
	}
	public static String concatWithStringBuffer(){
		StringBuffer sb = new StringBuffer("Square");
		for(int i =0;i<10000;i++){
			sb.append("Plums");
		}
		return sb.toString();
	}
	public static String concatWithStringBuilder(){
		StringBuffer sb = new StringBuffer("Square");
		for(int i =0;i<10000;i++){
			sb.append("Plums");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		long startTime =System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis()-startTime) + "ms");
		startTime =System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis()-startTime) + "ms");
		startTime =System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis()-startTime) + "ms");
	}
}
