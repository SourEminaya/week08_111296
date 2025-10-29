package week08_111296;

public class CreditCardPayment extends Payment {
	private String cardNumber;
	public CreditCardPayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber=cardNumber;
	}
	void processPayment() {
		System.out.println("Process payment of $ "+amount+"With card number "+cardNumber);
	}
}
