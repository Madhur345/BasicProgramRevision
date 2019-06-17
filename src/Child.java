
	class Child extends Parent{
		Child eat(){
			System.out.println("Eat Apple");
			return null;
		}
		public static void main(String[] args) {
			Child c = new Child();
			c.eat();
			Parent p = new Parent();
			p.eat();
		}
	}
