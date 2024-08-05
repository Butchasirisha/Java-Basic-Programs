package javaprograms;

import java.util.Scanner;

public class Star7 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter num");
		 n =scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();

	}

	}
}
