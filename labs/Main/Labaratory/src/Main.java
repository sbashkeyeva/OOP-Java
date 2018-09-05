
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gardener p = new Gardener(0, 0, 0);
		Gardener p2 = new Gardener(4, 4, 1);

		p.setName("Zhora");
		p2.setName("Poltos");

		p.start();
		p2.start();

	}

}
