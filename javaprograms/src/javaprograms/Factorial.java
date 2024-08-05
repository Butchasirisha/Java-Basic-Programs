package javaprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=0,sum=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		int n=scanner.nextInt();
		if(n==0||n==1)	
		{
		System.out.println("factorial of " +n+ "is 1");
		}
			for(int i=2;i<=n;i++)
			{
				fact=i;
				sum=sum*fact;
			}
			System.out.println(sum);
		
		}

}