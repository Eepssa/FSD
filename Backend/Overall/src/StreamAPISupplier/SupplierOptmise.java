package StreamAPISupplier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class SupplierOptmise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> l=new ArrayList<Integer>();
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();  //Array Size
      for(int i=0;i<n;i++) {
    	  l.add(sc.nextInt());
      }
      Collections.sort(l);
      Predicate<List<Integer>> pt=(t)->{
       
    	  for(int i=0;i<t.size()-2;i++) {
    		  if(t.get(i)==t.get(i+1))
    		  return false;
    		  
    	  } 
    	  
      return true;};
      System.out.println(l);
      System.out.println(pt.test(l));
	}

}
