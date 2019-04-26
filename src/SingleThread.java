
public class SingleThread implements Runnable{

	private int id;
	
	public SingleThread(int id)
	{
		this.id = id;
	}
	
	public void run() 
	{
		System.out.println("Starting " + id);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {e.printStackTrace();}
		
		System.out.println("Completed " + id);	
	}

}
