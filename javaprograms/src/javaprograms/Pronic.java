package javaprograms;

import java.util.Scanner;

public class Pronic {

	public static void main(String[] args) {
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num");
		int num=scanner.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				if(i*(i+1)==num)
				{
					sum=i;
				}
				
			}
		}
		if(sum!=0)
		{
			System.out.println("pronic number");
		}
		else {
			System.out.println("not pronic number");
		}
		
	}

}
