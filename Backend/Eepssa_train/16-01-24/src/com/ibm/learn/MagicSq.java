package com.ibm.learn;

public class MagicSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int ar[][]=new int[3][3];
      int a[][]= {{1,2,3},{1,2,3},{2,3,0}};
      int r=3,c=3;
      int row[]=new int[3]; int col[]=new int[3];
      for(int i=0;i<a.length;i++) {
     for(int j=0;j<a[i].length;j++) {
    		  row[i]+=a[i][j];
    		  }}
     for(int i=0;i<c;i++) {
         for(int j=0;j<r;j++) {
        		  col[i]+=a[j][i];
        		  }}
      for(int i=0;i<3;i++) {
    	  if(row[i]==6)
    		  System.out.println("Row"+i);
    	  if(col[i]==6)
    		  System.out.println("Col"+i);
    	  
      }
	}

}
