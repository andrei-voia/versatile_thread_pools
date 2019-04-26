import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

	Main main = new Main();
	
	public MyCallable(Main x)
	{
		main = x;
	}
	
	
    public String call() throws Exception {
    	
        Thread.sleep(500);
        
        return Thread.currentThread().getName();
    }

}
