package com.jspiders.practice.alphabets;

public class PatternK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;   
		for(int rows=0; rows<n;rows++){    
			for(int col=n/2; col<n;col++){     
				if(col==n/2||rows+col==n-1|| rows==col)     
					System.out.print("* ");     
				else      
					System.out.print("  "); 
				}    
		System.out.println();   
		}

	}

}
