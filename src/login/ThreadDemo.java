package login;

public class ThreadDemo extends Thread 
{
	public void run()      //running state
	{
		for(int i=0;i<3;i++) {
			System.out.println(i);
//			try {
//				Thread.sleep(2000);    //waiting 
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}

	public static void main(String[] args) 
	{
		ThreadDemo td=new ThreadDemo(); //New/start
		
		td.start(); // ready state
		td.setName("JOBITO");
		td.setPriority(MAX_PRIORITY);
		
		System.out.println(td.getName());
		System.out.println(td.getId());
		System.out.println(td.getPriority());
		System.out.println(td.getState());
		
		
		
		ThreadDemo td1=new ThreadDemo(); //New/start
		
		td1.start(); // ready state
		
		System.out.println(td1.getName());
		System.out.println(td1.getId());
		System.out.println(td1.getPriority());
		System.out.println(td1.getState());
		
		ThreadDemo td3=new ThreadDemo(); //New/start
		
		td3.start(); // ready state
		
		System.out.println(td3.getName());
		System.out.println(td3.getId());
		System.out.println(td3.getPriority());
		System.out.println(td3.getState());
		
	}

}
