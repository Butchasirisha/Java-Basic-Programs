package javaprograms;

import java.util.Scanner;

public class Deficient {

	public static void main(String[] args) {
		int sum=0;

		Scanner scanner=new Scanner(System.in);
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
		if(sum<num)
		{
			System.out.println("deficient number");
		}
		else {
			System.out.println("not an deficient number");
		}

	}

}
