
public abstract class P116Bank {
	abstract void rateOfInterest();
}
class SBI extends P116Bank{

	@Override
	void rateOfInterest() {
		int interest = 10;
		System.out.println("SBI rate of interest is  " +interest);
	}
}

class HDFC extends P116Bank {

	@Override
	void rateOfInterest() {
		int interest = 11;
		System.out.println("HDFC rate of interest is  " +interest);
	}
}

class BOI extends P116Bank {

	@Override
	void rateOfInterest() {
		int interest = 12;
		System.out.println("BOI rate of interest is " +interest);
	}
}