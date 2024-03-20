package Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MMTApp {
	public static int fare(String s,String d)
	{
	 if((s.compareTo("kolkata")==0 && d.compareTo("mumbai")==0) || (d.compareTo("kolkata")==0 && s.compareTo("mumbai")==0))
		 return 1000;
	 if((s.compareTo("kolkata")==0 && d.compareTo("delhi")==0) || (d.compareTo("kolkata")==0 && s.compareTo("delhi")==0))
		 return 2000;
	 if((s.compareTo("delhi")==0 && d.compareTo("mumbai")==0) || (d.compareTo("delhi")==0 && s.compareTo("mumbai")==0))
		 return 3000;
	 return 0;
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("mmu","mumbai");
		m1.put("ccu","kolkata");
		m1.put("del","delhi");
		HashMap<String,String> m2=new HashMap<String,String>();
		HashMap<HashMap,Integer> m3=new HashMap<HashMap,Integer>();
      while(true) {
    	  String src=sc.next();
    	  while(src==null || src.isEmpty())
    	  {
    		System.out.println("Source place is empty");  
    	  }
    	  String dest=sc.next();
    	  while(dest==null || dest.isEmpty())
    	  {
    		System.out.println("Destination place is empty");  
    	  }
    	  if(m1.containsKey(src)) 
    		  src=m1.get(src);
    	  if(m1.containsKey(dest)) 
    		  dest=m1.get(dest);
    	  m2.put(src,dest);
    	  m3.put((HashMap) m2, fare(src,dest));
    	  System.out.println(m3.get(m2));
    	  System.out.println("Enter 1 to continue 2 to exit");
    	  int i=sc.nextInt();
    	  if(i==2)
    	  {
    		  break;
    	  }
    	  
      }
	}

}
