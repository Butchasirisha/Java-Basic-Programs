package javaprograms;

import java.util.Scanner;

public class Composite {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 int count=0;
		System.out.println("enter the num");
		int num=scanner.nextInt();
		
		if(num==0 || num==1)
		{
			System.out.println("not a composite or a prime");
		}
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count>3)
		{
			System.out.println("composite");
			}
		else {
			System.out.println("prime");
		}
			
		}
				
	
	



	}


