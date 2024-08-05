package javaprograms;

import java.util.Scanner;

public class Nprimes {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to print n prime numbers within range");
		int a=scanner.nextInt();
		
		if(a<=0 && a==1) {
			System.out.println("not a prime");
		}
		else {
		for(int i=1;i<=a;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++) {
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

}
