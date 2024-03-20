package Generic;
import java.util.*;
import Generic.*;
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Movie> m=new ArrayList<Movie>();
     m.add(new Movie(1,1,"abs"));
     m.add(new Movie(1,4,"kbs"));
     m.add(new Movie(2,1,"abc"));
     System.out.println(m);
	}

	Genric<Movie> g=new Genric<>(new Movie(1,1,"abs"));
	System.out.println(g);
}
