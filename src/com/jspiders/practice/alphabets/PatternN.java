package com.jspiders.practice.alphabets;

public class PatternN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;  
		for(int rows=0; rows<n;rows++){  
			for(int col=0; col<n;col++){     
				if( col==0||rows==col||col==n-1)     
					System.out.print("* ");    
				else      
					System.out.print("  "); 
				}    
		System.out.println(); 
		}

	}

}
