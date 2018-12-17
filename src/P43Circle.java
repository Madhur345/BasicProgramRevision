
public class P43Circle {
	double radius;
	double area;
	static double pie =3.142;
	public static void main(String[] args) {
		P43Circle p = new P43Circle();
		p.radius=2.0;
		p.area =(p.radius)*(p.radius)*P43Circle.pie;
		System.out.println(	P43Circle.pie);
		System.out.println(p.radius);
		System.out.println(p.area);
	}
}
