package com.ibm.learn;

public abstract class Vehicle {
      
	 private int no;
	 
		 // TODO Auto-generated method stub
       
       public int getNo()
   	{
   		return no;
   	}
   	public void setNo(int no)
   	{
   		this.no=no;
   	}
	public static void main(String args[]) {
		Vehicle v=(Vehicle) new I20();
		System.out.println(v.getNo());
		
	
	}

}
