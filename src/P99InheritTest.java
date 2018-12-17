public class P99InheritTest{
	public static void main(String[] args) {
		P97CreditCard cc = new P97CreditCard();
		System.out.println(cc.name="Kotak Silver Credit Card");
		cc.swipe();
		System.out.println(cc.creditLimit=20000);
		System.out.println(cc.cardNum="2095 4535 9087 2189");
		cc.withdrawMoney();
		System.out.println(cc.expDate="11/19");
		System.out.println("==========================");
		P96DebitCard dc = new P96DebitCard();
		System.out.println(dc.name="Kotak Plantinum Debit Card");
		dc.swipe();
		System.out.println(dc.cardNum="3095 6535 7087 1189");
		dc.withdrawMoney();
		System.out.println(dc.expDate="01/20");
		System.out.println("==========================");
		P98GiftCard gc = new P98GiftCard();
		System.out.println(gc.name="Kotak Gold Gift Card");
		gc.swipe();
		System.out.println(gc.points=1500);
		System.out.println(gc.cardNum="3095 6535 7087 1189");
		System.out.println(gc.expDate="06/20");
	}
}