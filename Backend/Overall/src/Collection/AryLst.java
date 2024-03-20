package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AryLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> al=new ArrayList<String>();
   al.add("scan");
   al.add("wall");
    
   boolean p=false;
   Scanner sc=new Scanner(System.in);
   String a=sc.next();
   String b = null;
   char[] nk=a.toCharArray();
	for(String ch:al) {
	   if(a.length()==ch.length()) {
		   char[]tp=ch.toCharArray();
		  Arrays.sort(tp);
		  Arrays.sort(nk);
		  
		   for(int i=0;i<tp.length;i++) {
			  if(nk[i]==tp[i]) 
			  {
				p=true;  
		   }
			  else{p=false;}
	   }
		   
   }if(p==true) 
	   {b=ch;
	   break;
	   }
   
	}
	if(p==true)
		System.out.println("The correct word is "+b);
	else
		System.out.println("Wrong");
	
	}

}
