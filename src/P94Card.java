
public class P94Card {
	String name;
	String cardNum;
	String expDate;
	void swipe(){
		System.out.println("Swipe the card");
	}
}
class P95CashCard extends P94Card{
	void withdrawMoney(){
		System.out.println("Withdraw the money");
	}
}
class P96DebitCard extends P95CashCard{
}
class P97CreditCard extends P95CashCard{
	int creditLimit;
}
class P98GiftCard extends P94Card{
	int points;
}
