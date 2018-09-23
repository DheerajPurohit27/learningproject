package Collection;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class MyThread implements  Runnable{

	public MyThread()  {
		// TODO Auto-generated constructor stub
		System.out.println("new thread is created. ");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("am from Mythread ");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
	}
	
}
public class Assessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadPoolExecutor executer=(ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++)
		{
			MyThread t1=new MyThread();
			executer.execute(t1);
			
		}
		System.out.println("\nmaximum number of threads inside pool:" + executer.getMaximumPoolSize() + "\n");
		executer.shutdown();
		
	}

}
