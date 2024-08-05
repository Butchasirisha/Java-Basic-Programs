package javaprograms;

import java.util.Scanner;

public class Star16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("enter the number");
int n=scanner.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=n;j>=i;j--)
	{
		System.out.print(" ");
	
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print("*");
	
	}
	for(int l=2;l<=i;l++)
	{
		System.out.print("*");
	
	}
	System.out.println();
}
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i+1;j++)
	{
		System.out.print(" ");
	
	}
		for(int k=4;k>=i;k--)
		{
			System.out.print("*");
		
		}
		for(int l=3;l>=i;l--)
		{
			System.out.print("*");
		
		}
		System.out.println();
	}
	
}

	}


