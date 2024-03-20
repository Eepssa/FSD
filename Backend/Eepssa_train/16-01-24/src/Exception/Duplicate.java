package Exception;
import java.util.Scanner;
public class Duplicate {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 System.out.println(check());
     }
     catch(DuplicateException d)
     {System.out.println(d.getMessage());
       }}

    public static boolean check() throws DuplicateException {
    	 Scanner sc=new Scanner(System.in);
    	 
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++) {
    	 a[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++) {
    	 for(int j=i+1;j<n;j++) {
        	 if(a[i]==a[j]) {
        		 throw new DuplicateException("Duplicate");
        	 }
     
         }
     }
     return false;
    }
    
}
