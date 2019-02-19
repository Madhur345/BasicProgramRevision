
public class P121File {
	public static void main(String[] args) {
		int i =10;
		System.out.println(i);
		Integer iob = new Integer(i);
		Integer iob1 = i;
		System.out.println("iob" +" "+ iob);
		int j = new Integer(i);
		int k = iob.valueOf(iob);
		System.out.println("j" +" "+ j);
		System.out.println("k" + " "+k);
	}
}
