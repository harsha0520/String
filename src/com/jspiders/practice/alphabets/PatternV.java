package com.jspiders.practice.alphabets;

public class PatternV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;  
		for(int rows=0; rows<n;rows++){  
			for(int col=0; col<n;col++){     
				if(rows==col&&rows<n/2||rows+col==n-1&&rows<=n/2)    
					System.out.print("* ");    
				else      
					System.out.print("  ");   
				}   
			System.out.println();  
			}

	}

}
