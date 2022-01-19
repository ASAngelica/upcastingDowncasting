package entities;

public class BusinessAccount extends Account {
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		
		if(amount <= loanLimit) {
			loanLimit -= amount;
			balance += amount - 10.0;
			System.out.println("Withdrawal of the Business account loan limit ($ 1000.0)\nand $ 10.0 fee discount:");
			System.out.println("$ " + amount);
			System.out.println("Your loan limit from now on is: \n$ " + loanLimit);
			System.out.println("Your balance has been updated to: " + super.getBalance());
		}
		else {
			System.out.println("Enter a loan amount up to $ " + loanLimit );
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	@Override
	public String toString() {
		return "Numero: "
				+ number
				+ ", "
				+ "Holder: "
				+ holder
				+ ", "
				+ "Balance: $"
				+ balance
		        + ", "
		        + "Limite para Empréstimo: "
		        + loanLimit;
	}
}
