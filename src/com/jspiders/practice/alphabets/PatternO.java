package com.jspiders.practice.alphabets;

public class PatternO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;  
		for(int rows=0; rows<n;rows++){    
			for(int col=0; col<=n/2;col++){     
				if(col==0 && rows!=0 && rows!=n-1|| col==n/2 && rows!=0 && rows!=n-1||rows==0&&col!=n/2&&col!=0||rows==n-1&&col!=n/2&&col!=0)  
					System.out.print("* ");    
				else      
					System.out.print("  ");  
				}    
		System.out.println();  
		}

	}

}
