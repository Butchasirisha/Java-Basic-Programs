package javaprograms;

import java.util.Scanner;

public class Hstar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter num");
		n =scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("  ");
}
			for(int k=1;k<=i;k++)
			{
				if(k==1 || i==n)
				{		System.out.print(" *");
			}
				else {
					System.out.print("  ");
				}
			}
			for(int l=2;l<=i;l++)
			{
				if(l==i || i==n) {
					
				
				System.out.print(" *");
			}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
