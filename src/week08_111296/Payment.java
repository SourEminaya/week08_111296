package week08_111296;

public abstract class Payment {
	protected double amount;
	public Payment (double amount) {
		this.amount=amount;
	}
	abstract void processPayment();
	public void paymentDetails() {
		System.out.println("Processing payment of $ " + amount);
	}
}
