
public class CheckingAccount extends Account {
	public CheckingAccount(int a,double cnt) {
		super(a);
		counter=cnt;
		// TODO Auto-generated constructor stub
	}
	public double counter;
	public double FREE_TRANSACTION = 5;
	public void transfer(double amount, Account other)
	{
      super.transfer(amount, other);
      counter++;
	}
	
	public void deductFee()
	{
		if(counter>FREE_TRANSACTION)
		{
			withdraw(0.02*(counter-(FREE_TRANSACTION)));
		}
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		deductFee();
		counter = 0;
	}

}
