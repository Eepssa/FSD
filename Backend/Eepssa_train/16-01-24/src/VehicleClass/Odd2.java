package VehicleClass;

public class Odd2 {
	int a;
	Odd2(){
		super();
		this.a=a;
	}
	 
	public void run() {
		for(int i=1;i<=a;i+=2)
		{
			System.out.println("Thread 2"+i);
		}
	}
	
     

}
