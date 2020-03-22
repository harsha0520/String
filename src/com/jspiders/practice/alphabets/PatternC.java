package com.jspiders.practice.alphabets;

public class PatternC {

	public static void main(String[] args) {
		  int n = 10;   for(int rows=0; rows<n;rows++){
			  for(int col=0; col<n;col++) {    
				  if( rows==0 && col!=0|| rows==n-1 && col!=0||col==0 & rows!=0 && rows!=n-1)    
					  System.out.print("* ");    
				  else     
					  System.out.print("  ");    
				  }  
		               System.out.println();   
		  }

	}

}
