package com.gamrahassina.javacore.loops;

public class Loops {

	public static void main(String[] args) {
		
		
		for (int i = 1; i < 7; i++) 
		{
			
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}
		
		System.out.println("*********************************************************************");
		
		for (char i = 65; i < 68; i++) 
		{
			
			for (char j = 65; j <= i; j++) 
			{
				System.out.print(j+" ");	
			}
			System.out.println();
		}
		
		System.out.println("*********************************************************************");
		
		for (int i = 0; i <4; i++) {
			for (int j = 0; j < 4; j++)
			{
				if(i == 0 || i == 3)
				{
					System.out.print("$ ");
				}
				else
				{
					if(j==0 || j==3)
					{
						System.out.print("$ ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				
			}
			
			System.out.println();
			
		}
	}

}
