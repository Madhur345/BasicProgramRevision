
interface P117IFlipkart {
	 void dispImg();
	 void dispPrice();
}
interface IWatch extends P117IFlipkart{
	public void watchType();
}
interface ISunglass extends P117IFlipkart{
	public void brand();
}
 class All implements IWatch,ISunglass{
	 
	   public void dispImg(){
		 System.out.println("Display the image");
	 }
	  public void dispPrice(){
		 System.out.println("Display the price");
	 }
	  public void watchType(){
		 System.out.println("Watch Type is digital");
	 }
	  public void brand(){
		  System.out.println("Brand Name is Titan");
	  }
 }