
public class Casting1 {
	public static void main(String[] args) {
		int i =10;
		float j =i;
		short k = (short)i;
		short t =(short)(double)(float)i;
		short m =(byte)(short)(double)(float)i;
		//byte n=(short)(double)(float)i;//compilation error as short is higher than byte
		System.out.println(j);
		System.out.println(k);
		System.out.println(t);
		System.out.println(m);
	}
}
