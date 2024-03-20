package Generic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Pair<Integer,Movie> p=new Pair<Integer,Movie>();
   p.setOb1(11);
   p.setOb2(new Movie(1,2,"abc"));
   System.out.println(p);
   
	}

}
