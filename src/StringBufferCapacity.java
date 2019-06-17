
public class StringBufferCapacity {
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("Hello");
		StringBuffer sp = new StringBuffer("Hello");
		System.out.println(sp.equals(sf));
		System.out.println(sf.capacity());
		sf.append("Hello");
		System.out.println(sf.capacity());
		sf.append("java testing with selenium");
		System.out.println(sf.capacity());
		sf.ensureCapacity(10);
		System.out.println(sf.capacity());
		sf.ensureCapacity(50);
		System.out.println(sf.capacity());
		sf.append("java testing with selenium");
		System.out.println(sf.capacity());
		sf.ensureCapacity(90);
		System.out.println(sf.capacity());
		sf.ensureCapacity(91);
		System.out.println(sf.capacity());
	}
}
