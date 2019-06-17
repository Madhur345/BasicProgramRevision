
public class RunGoogle {
	public static void main(String[] args) {
		IGoogle g = new News();
		g.search();
		g = new Map();
		g.search();
		g = new Image();
		g.search();
	}	
}
