public class UnionBank implements Bank {
	private double balance;
	public void deposite(double amt)throws InvalidAmountException {
		if(amt <= 0){
			throw new InvalidAmountException(amt+"  is invalid amount");
		}
		balance = balance+amt;
	}
	public double withdraw(double amt) throws InvalidAmountException, InSufficientFundException {
		if(amt <= 0){
			throw new InvalidAmountException(amt +"  is invalid amount");
		}
		if(balance < amt){
			throw new InSufficientFundException("InSufficient Funds....");
		}
		balance = balance-amt;
		return balance;
	}
	public void balanceEnquiry(){
		System.out.println("Current Balance ::"+balance);
	}
}