package com.venkadesh;

public class assignment_7 {

	public static void main(String[] args) {
		
		
int num=9;
		
		for(int i=1;i<=num;i++)
		{
			for(int k=num;k>=i;k--)
			{
				System.out.print(" ");
				k=k-1;
			}
			
			for (int j =1; j<=i; j++) 
			{
				
				System.out.print(j);
		
			}
			
			System.out.println(); 
			i++;
			
		}
		
		for(int i=num;i>=1;i--)
		{
			for(int k=i;k<=num;k++)
			{
				System.out.print(" ");
				k=k+1;
			}
			
			for (int j=i; j>=1; j--) 
			{
				
				System.out.print(j);
		
			}
			
			System.out.println(); 
			i--;
			
		}
 

	}

}
