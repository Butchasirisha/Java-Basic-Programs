package javaprograms;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		 int count=0;
		System.out.println("enter the num");
		int num=scanner.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println("factor is " + i);
			}
		}
		
		}
				
	
	


	}


