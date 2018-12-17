
public class P104Run {
	public static void main(String[] args) {
		P102Gmail gmail = new P102Gmail();
		gmail.login("admin","password");
		P103GooglePlus google = new P103GooglePlus();
		google.login("admin","password");
	}
}
