package javaprograms;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the numbers");
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	for(int i=1;i<=a && i<=b;i++)
	{
		if(a%i==0 && b%i==0)
		{
			System.out.print(i);
		}
	}
	
	}
	}

