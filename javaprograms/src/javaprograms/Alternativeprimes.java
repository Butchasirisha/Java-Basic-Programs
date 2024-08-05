package javaprograms;

import java.util.Scanner;

public class Alternativeprimes {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=scanner.nextInt();
		int k=0;
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
				if(k%2!=0) {
					System.out.println(i);
					
				}
				k++;
			}
		
					}
		}
	}

}
