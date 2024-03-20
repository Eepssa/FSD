package com.ibm.learn;

public class Pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPal("madam"));
System.out.println(isPal2("madam",0,4));
	}
 static boolean isPal(String s) {
 String c="";
 boolean p=false;
  for(int i=s.length()-1;i>=0;i--) {
	  c+=s.charAt(i);}
  if(c.equals(s))
	  p=true;
  return p;
 }
 static boolean isPal2(String s, int i,int j) {
	 if(s.equals(""))
		 return true;
	 if(s.charAt(i)!=s.charAt(j))
		 return false;
	 while(i<j-1) 
		 return isPal2(s, i+1,j-1);
	return true;
		 
			 
 }}
 
