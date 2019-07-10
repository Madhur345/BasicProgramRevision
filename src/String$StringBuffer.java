
public class String$StringBuffer {
	public static String concatWithString(){
		String t ="Square";
		for(int i=0; i<100000;i++){
			t = t+" Plums";
		}
		return t;
	}
	public static String concatWithStringBuffer(){
		StringBuffer sb = new StringBuffer("Square");
		for(int i=0; i<100000;i++){
			sb.append(" Plums");
		}
		return sb.toString();
	}
	public static String concatWithStringBuilder(){
		StringBuilder sb = new StringBuilder("Square");
		for(int i=0; i<100000;i++){
			sb.append(" Plums");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken with concanting String :" +(System.currentTimeMillis()-startTime) +"ms");
		startTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken with concanting StringBuffer :" +(System.currentTimeMillis()-startTime) +"ms");
		startTime=System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println("Time taken with concanting StringBuilder :" +(System.currentTimeMillis()-startTime) +"ms");

	}

}