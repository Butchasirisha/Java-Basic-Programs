package javaprograms;

import java.util.Scanner;

public class Star14 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n;
	System.out.println("enter num");
	n =scanner.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
		  System.out.print("*");
		}
		System.out.println();
	}
	
}
}

	