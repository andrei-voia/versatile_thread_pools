
public class Threads implements Runnable{

	Operations op = new Operations();
	
	public void run()
	{
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//op.wasteTime();
	}
}
