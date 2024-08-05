package javaprograms;

import java.util.Scanner;

public class Abundant {

	public static void main(String[] args) {
		int sum=0;

		Scanner scanner=new Scanner(System.in);
		 int count=0;
		System.out.println("enter the num");
		int num=scanner.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("factor is " + i);
				sum=sum+i;
			}
		}
		if(sum>num)
		{
			System.out.println("abundant number");
		}
		else {
			System.out.println("not an abundant number");
		}
	}

}
