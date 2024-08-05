package javaprograms;

import java.util.Scanner;

public class Hstar9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner scanner=new Scanner(System.in);
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter num");
		n =scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			
			}
			for(int k=1;k<=i;k++)
			{
				if(k==1 ) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int l=2;l<=i;l++)
			{
				if(l==i ) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			
			}
				for(int k=n-1;k>=i;k--)
				{
					if(k==n-2) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				for(int l=n-1;l>=i;l--)
				{
					if(l==i) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
			
		}
		
		}

	


