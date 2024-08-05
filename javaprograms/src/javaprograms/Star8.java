package javaprograms;

import java.util.Scanner;

public class Star8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter num");
		 n =scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();

	}

}
}
