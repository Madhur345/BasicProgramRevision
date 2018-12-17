
public class P106Zoo {
	public static void main(String[] args) {
		P105Animal animal = new P105Animal();
		animal.sound();
		animal.run();
		Lion l = new Lion();
		l.sound();
		l.run();
		Dog d = new Dog();
		d.sound();
		d.run();
		Cat c = new Cat();
		c.sound();
		c.run();
	}
}
