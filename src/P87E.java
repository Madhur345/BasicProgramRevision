
public class P87E {
	int i =10;
	void disp(){
		System.out.println("execute supermost class");
	}
}
class P88F extends P87E {
	int j =20;
	void print(){
		System.out.println("execute super class");
	}
}