
public abstract class Account {
	private double balance;
	private int accNumber;
	public Account(int a)
	{
		balance =0.0;
		accNumber=a;
		
	}
	public void deposit(double sum)
	{
		balance+=sum;
	}
	public void withdraw(double sum)
	{
		balance-=sum;
	}
	public double getBalance()
	{
		return balance;
	}
	public int getAccountNumber()
	{
		return accNumber;
	}
	public void transfer(double amount, Account other)
	{
		withdraw(amount);
		other.deposit(amount);
	}
	public String toString()
	{
		return "Balance:"+" "+balance+" "+"Account Number:" +" "+accNumber;
	}
	public final void print()
	{
		System.out.println(toString());
	}
	public boolean equals(Object b) {
		if(b!=null && this.getClass()==b.getClass())
			if(this.accNumber==((Account)b).accNumber)
				return true;
		return false;
	}
	abstract public void update();

}
