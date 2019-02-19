
public class RunGoogle {
	public static void main(String[] args) {
		IGoogle g = new News();
		g.search();
		IGoogle	g1 = new Map();
		g1.search();
		g = new Image();
		g.search();
	}	
}
