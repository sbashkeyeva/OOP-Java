package revise;

public abstract class PrintDecorator implements Printer {
	protected Printer decoratedPrinter;
	public PrintDecorator(Printer p)
	{
		this.decoratedPrinter=p;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		decoratedPrinter.print();
	}
	

}
