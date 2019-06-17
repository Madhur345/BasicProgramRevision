
public class IneritanceCreditCard extends InheritanceCard {
	int cardLimit;
	void withdrawMoney(){
		System.out.println("Withdraw the money upto " + cardLimit);
	}
	public static void main(String[] args) {
		IneritanceCreditCard cc = new IneritanceCreditCard();
		cc.cardLimit=15000;
		System.out.println("Credit Limit is "+ cc.cardLimit);
		cc.withdrawMoney();
		cc.name ="Vishal Madhur";
		System.out.println("Name on card is " + cc.name);
		cc.cardNum=82918201820192L;
		System.out.println("Card Number is " +cc.cardNum);
		cc.expDate="June 2020";
		System.out.println("Expiary Date of card is " +cc.expDate);
		cc.swipe();
	}
}
