
public class UpcastingDowncasting {
	public static void main(String[] args) {
		Upcasting1 up1 = new Upcasting2();
		up1.t1();
		//up1.t2();//compilation error as t2()is hidden for a1 object;
		Upcasting2 up2 =(Upcasting2)up1;
		up2.t1();
		up2.t2();
	}
}
