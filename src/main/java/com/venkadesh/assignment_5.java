package com.venkadesh;

public class assignment_5 {

	public static void main(String[] args) {
		
		
byte num=9;
		
		for(byte i=1;i<=num;i++)
		{
			for(int k=num;k>=i;k--)
			{
				System.out.print(" ");
				k=k-1;
			}
			
			for (byte j =1; j<=i; j++) 
			{
				
				System.out.print(j);
		
			}
			
			System.out.println(); 
			i++;
			
		}
	}

}
