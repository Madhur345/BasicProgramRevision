
public abstract class P115Flipkart {
	void dispLogo(){
		System.out.println("display flipkart logo");
	}
	abstract void dispImage();
	abstract void dispPrice();
}
class Sunglass extends P115Flipkart{
	void dispPrice(){
		System.out.println("display sunglass price list");
	}
	void dispImage(){
		System.out.println("display sunglass image");
	}
}
class Watch extends P115Flipkart{

	@Override
	void dispImage() {
		System.out.println("display watch image");
	}
	@Override
	void dispPrice() {
		System.out.println("display watch Price");
	}
}

class Book extends P115Flipkart{

	@Override
	void dispImage() {
		System.out.println("display watch Image");		
	}
	@Override
	void dispPrice() {
		System.out.println("display book price");		
	}
}