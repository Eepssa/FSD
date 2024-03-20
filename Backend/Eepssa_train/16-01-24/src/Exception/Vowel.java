package Exception;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	    	 System.out.println(checkv());
	     }
	     catch(VowelException d)
	     {System.out.println(d.getMessage());
	     }
	}
	public static boolean checkv() throws VowelException {
   	 Scanner sc=new Scanner(System.in);
   	 
    String n=sc.nextLine();
    
    for(int i=0;i<n.length();i++) {
   	
       	 if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||
       			n.charAt(i)=='u') {
       		 throw new VowelException("Vowel");
       	 }
    
        }
    
    return false;
   }
   
}


