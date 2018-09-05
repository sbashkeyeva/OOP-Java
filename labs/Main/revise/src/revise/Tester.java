package revise;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer plasticPrinter=new PlasticPrinter();
		Printer plastic3dPrinter=new Printer3D(new PlasticPrinter());
		Printer paper3dPrinter=new Printer3D(new PaperPrinter());
		plasticPrinter.print();
		plastic3dPrinter.print();
		paper3dPrinter.print();

	}

}
