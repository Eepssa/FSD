package VehicleClass;

public class Even2 extends Thread {
	int a;
	Even2(int a){
		super();
		this.a=a;
	}
	 
	@Override
	public void run() {
		for(int i=2;i<=a;i+=2)
		{
			System.out.println("Thread 2"+i);
		}
	}
	}
