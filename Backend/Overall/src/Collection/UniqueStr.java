package Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

 
public class UniqueStr {
	public static String unique(String s) {
			String u="";
			for(int i=0;i<s.length();i++) {
				u+=s.charAt(i);
				for(int j=i+1;j<s.length();j++) {
					if(s.charAt(i)==s.charAt(j)){
						i+=1;
						}
				}
			}
			return u;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String,String> m=new LinkedHashMap<String,String>();
       Scanner sc=new Scanner(System.in);
       while(sc.nextInt()==1) {
    	   String str1=sc.next();
    	   if(m.get(str1)==null)
    	   { m.put(str1, unique(str1));
    	   System.out.println("New "+m.get(str1));}
    	   else
    	   System.out.println("Old "+m.get(str1));
       }
       
    	   
	}

}
