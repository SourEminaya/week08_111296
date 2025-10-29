package week08_111296;

public class BankTransferPayment extends Payment{
	private String bankAccount;
	public BankTransferPayment(double amount, String bankAccount) {
		super(amount);
		this.bankAccount=bankAccount;
	}
	void processPayment() {
		System.out.println("Process payment of $ "+amount+"With bank number "+bankAccount);
	}
}
