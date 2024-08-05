package javaprograms;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 int count=0;
		System.out.println("enter the num");
		int num=scanner.nextInt();
		
		if(num==0 || num==1)
		{
			System.out.println("not a prime");
		}
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime num");
			}
		else {
			System.out.println("not prime");
		}
			
		}
				
	}
	

