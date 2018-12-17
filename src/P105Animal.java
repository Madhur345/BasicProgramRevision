
public class P105Animal {
	void sound(){
		System.out.println("Animal have different sounds");
	}
	void run(){
		System.out.println("Animal run with differnt speeds");
	}
}
class Lion extends P105Animal{
	void sound(){
		System.out.println("Lion- roar roar");
	}
	void run(){
		System.out.println("Lion - 60 km/hr");
	}
}
class Dog extends P105Animal{
	void sound(){
		System.out.println("Dog- bhaw bhaw");
	}
	void run(){
		System.out.println("Dog - 50 km/hr");
	}
}
class Cat extends P105Animal{
	void sound(){
		System.out.println("Cat- mew mew"); 
	}
	void run(){
		System.out.println("Cat - 40 km/hr");
	}
}