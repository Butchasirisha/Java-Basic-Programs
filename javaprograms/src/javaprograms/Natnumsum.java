package javaprograms;

import java.util.Scanner;

public class Natnumsum {
	public static void main(String[] args) {
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the range");
		int n=scanner.nextInt();
		if(n==0)
		{
			System.out.println("cannot be a natural number");
		}
		else {
			
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		
			System.out.println("sum is"+sum);
		}
	}

}
