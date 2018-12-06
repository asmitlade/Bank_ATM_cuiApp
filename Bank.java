interface Bank {
	void deposite(double amt) throws InvalidAmountException;
	double withdraw(double amt) throws InvalidAmountException, InSufficientFundException;
	void balanceEnquiry();
}