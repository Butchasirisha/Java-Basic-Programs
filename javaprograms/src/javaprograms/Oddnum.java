package javaprograms;

import java.util.Scanner;

public class Oddnum {
	public static void main(String[] args) {
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the range");
		int n=scanner.nextInt();
		for(int i=0;i<=n;i++)
		{
		if(i%2!=0)
		{
			System.out.println("odd is " +i);
		}
}
		}
	
}

