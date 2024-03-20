package FunctionalInterface;

import java.util.Scanner;

interface Fibona{
	void fibo(int n);
}
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		
    Fibona f=(k)->{
    	int a=0,b=1;
    	int c;
    	while(k>0)
    {   
    	
    		System.out.print(a+" ");
    		c=a+b;
            a=b;
            b=c;
            k--;}
    };
	f.fibo(n);}

}
