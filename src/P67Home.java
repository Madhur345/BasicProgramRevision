
public class P67Home {
	void openDoor(){
		System.out.println("Door Opens");
		closeDoor();
	}
	void closeDoor(){
		System.out.println("Door Closes");
		openDoor();
	}
	public static void main(String[] args) {
		P67Home p = new P67Home();
		p.openDoor();
	}
}
