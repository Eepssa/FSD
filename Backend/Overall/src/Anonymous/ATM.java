package Anonymous;

interface ATMOperation{
	void deposit();
	void withdraw();
}
class Test{
	void show() {
		
	}
}
abstract class All{
	abstract void met();
}
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ATMOperation icici=new ATMOperation() {

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in ICICI Bank");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw from ICICI Bank");
	}
	  
  };
  ATMOperation hdfc=new ATMOperation() {

		@Override
		public void deposit() {
			// TODO Auto-generated method stub
			System.out.println("Deposit in HDFC Bank");
		}

		@Override
		public void withdraw() {
			// TODO Auto-generated method stub
			System.out.println("Withdraw from HDFC Bank");
		}
		  
	  };
	  icici.withdraw();
	  hdfc.deposit();
	  Test t=new Test() {
		 void show() {
			 System.out.println("Acts on concrete class and abstract class");
		 }
	  };
	  t.show();
	}

}
