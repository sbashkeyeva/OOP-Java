
public class testPrintThread {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		PrintThread pt = new PrintThread("pt");
	    pt.setPriority(Thread.MIN_PRIORITY);//the same as thread.setPriority(1);
		pt.start();
		pt.join();
		PrintThreadR ptr= new PrintThreadR("ptr");
		Thread thread = new Thread(ptr);
		thread.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread.getPriority()); // will be 5, because by default Thread.NORM_Priority is set, which is 5
		//thread.setPriority(10); //the same as thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
	}

}
