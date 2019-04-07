
public class SwapWithoutTemp {  
	public static void main(String args[]) {  
		String a ="Love";
		String b ="You";
		System.out.println("Before Swap");
		System.out.println(a +" " + b);
		a =a+b;
		b=a.substring(0,a.length()-b.length()); 
		a=a.substring(b.length());
		System.out.println("After Swap");
		System.out.println(a +" " + b);

	}  
}  
