package example;

public class Employee extends Thread{

	@Override
	public void run() {
		System.out.println("Working");
		
		Thread t = Thread.currentThread();
		System.out.println("Id : "+t.getId());
		System.out.println("Name : "+t.getName());
		System.out.println("Prority : "+t.getPriority());
	}
}
