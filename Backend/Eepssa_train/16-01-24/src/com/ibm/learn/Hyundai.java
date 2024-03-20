package com.ibm.learn;

public abstract class Hyundai extends Vehicle implements VehicleOp {

	
	public abstract void speed() ;
	
	public abstract void capacity();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Hyundai b=new Creta();
     b.speed();
	}

}
