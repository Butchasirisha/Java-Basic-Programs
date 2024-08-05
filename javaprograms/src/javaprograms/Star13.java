package javaprograms;

import java.util.Scanner;

public class Star13 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter num");
		n =scanner.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i>=2 && k>1)
				{
					System.out.print(" ");
				}
				else {
					
					System.out.print("*");
				}
			}
			
			for(int j=1;j<=i;j++)
			{
				if(i>=2 && j<=i-1 )
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
	}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i>=2 && j<=i-1 )
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i>=2 && k>1)
				{
					System.out.print(" ");
				}
				else {
					
					System.out.print("*");
				}
			}
			System.out.println();
	}

	}

}
