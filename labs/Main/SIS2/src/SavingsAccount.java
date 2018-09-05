
public class SavingsAccount extends Account {
	public SavingsAccount(int a,double intRate) {
		super(a);
		interestRate=intRate;
		// TODO Auto-generated constructor stub
	}
	public double interestRate;
	public void addInterest()
	{

		deposit(getBalance()*interestRate/100.0);
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		addInterest();
	}
	

}
