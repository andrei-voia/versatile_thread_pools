
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] argv)
	{
		System.out.println("starting program...");
		double elapsedN;
		long n = System.nanoTime();

		ExecutorService executor;
        

			executor = Executors.newFixedThreadPool(2);
			
			for(int i = 0; i < 10; i++)
			{
				executor.submit(new SingleThread(i));
			}
			
			executor.shutdown();
			
			try {
				executor.awaitTermination(1, TimeUnit.DAYS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Completed one loop ...");
			
			
			executor = Executors.newCachedThreadPool();
			
			
			
			for(int i = 0; i < 7; i++)
			{
				executor.submit(new SingleThread(i));
			}
			
			executor.shutdown();
			
			try {
				executor.awaitTermination(1, TimeUnit.DAYS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Completed one loop ...");

		

		
		System.out.println("All tasks completed ...");
		
		
		elapsedN = ((System.nanoTime() - n) / 1000000000.0);
		System.out.println("Seconds: " + elapsedN);
	}
}
