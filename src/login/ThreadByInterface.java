package login;

public class ThreadByInterface implements Runnable
{
	public void run() 
	{
		System.out.println("thread by the runnable interface");	
	}
	
	public static void main(String[] args) {
		ThreadByInterface tbt=new ThreadByInterface();
		
		Thread td=new Thread(tbt);
		
		td.start();	
	}
}
