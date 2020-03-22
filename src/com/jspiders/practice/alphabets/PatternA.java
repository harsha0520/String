package com.jspiders.practice.alphabets;

public class PatternA {

	public static void main(String[] args) {
		int n = 7;  
		for(int rows=1; rows<n;rows++)   {  
			for(int col=1; col<=n/2;col++)    {  
				if(col==1 || rows==1 || col==n/2 || rows==n/2)     
					System.out.print("* ");   
				else      System.out.print("  ");    }    
		System.out.println();  
		}

	}

}
