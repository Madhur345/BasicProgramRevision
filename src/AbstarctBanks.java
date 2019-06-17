
public abstract class AbstarctBanks {
	abstract void rate0fInterest();
}

class SBINew extends AbstarctBanks{
	void rate0fInterest(){
		int interest =10;
		System.out.println("Rate of Interest of SBI " + interest + "%");
	}
}

class Kotak extends AbstarctBanks{
	void rate0fInterest(){
		int interest =12;
		System.out.println("Rate of Interest of KOTAK " + interest + "%");
	}
}

class HDFCNew extends AbstarctBanks{
	void rate0fInterest(){
		int interest =14;
		System.out.println("Rate of Interest of HDFC " + interest + "%");
	}
}