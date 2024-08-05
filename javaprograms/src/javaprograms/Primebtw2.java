package javaprograms;

import java.util.Scanner;

public class Primebtw2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter start range");
		int a=scanner.nextInt();
		System.out.println("enter last range");
		int b=scanner.nextInt();
		for(int i=a; i<=b;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
			}
		
	}

}
