
public class TesterAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CheckingAccount a= new CheckingAccount(1,4);
      SavingsAccount b=new SavingsAccount(2,6);
      Bank bank=new Bank();
      b.deposit(1000);
      a.deposit(2000);
      a.transfer(500, b);
      bank.open(a);
      bank.open(b);
      bank.update();
      a.print();
      b.print();
      
      
	}

}
